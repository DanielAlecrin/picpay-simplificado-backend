package br.com.alecrin.picpay_simplificado_backend.wallet;

import org.springframework.data.repository.CrudRepository;

public interface WalletRepository extends CrudRepository<Wallet, Long> {
    
}
