package br.com.alecrin.picpay_simplificado_backend.transaction;

import org.springframework.stereotype.Service;

import br.com.alecrin.picpay_simplificado_backend.wallet.WalletRepository;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;
    private final WalletRepository walletRepository;

    public TransactionService(TransactionRepository transactionRepository, WalletRepository walletRepository) {
        this.transactionRepository = transactionRepository;
        this.walletRepository = walletRepository;
    }

    public Transaction create(Transaction transaction) {
        
    }

}
