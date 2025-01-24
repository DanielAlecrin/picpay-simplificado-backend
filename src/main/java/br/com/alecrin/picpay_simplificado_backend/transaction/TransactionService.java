package br.com.alecrin.picpay_simplificado_backend.transaction;

import org.springframework.stereotype.Service;

import br.com.alecrin.picpay_simplificado_backend.wallet.Wallet;
import br.com.alecrin.picpay_simplificado_backend.wallet.WalletRepository;
import br.com.alecrin.picpay_simplificado_backend.wallet.WalletType;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;
    private final WalletRepository walletRepository;

    public TransactionService(TransactionRepository transactionRepository, WalletRepository walletRepository) {
        this.transactionRepository = transactionRepository;
        this.walletRepository = walletRepository;
    }

    public Transaction create(Transaction transaction) {

        var newTransaction = transactionRepository.save(transaction);

        var wallet = walletRepository.findById(transaction.payer()).get();
        walletRepository.save(wallet.debit(transaction.value()));

        return newTransaction;
    }

    /**
     * - the payer has a commom wallet
     * - the payer has enough balance
     * - the payer is not the payee
     */
    private void validate(Transaction transaction) {
        walletRepository.findById(transaction.payee())
            .map(payee -> walletRepository.findById(transaction.payer())
                .map(payer -> isTransactionValid(transaction, payer) ? transaction : null)
                .orElseThrow())
                .orElseThrow();
    }

    private boolean isTransactionValid(Transaction transaction, Wallet payer) {
        return payer.type() == WalletType.COMUM.getValue() &&
            payer.balance().compareTo(transaction.value()) >= 0 &&
            !payer.id().equals(transaction.payee());
    }
}
