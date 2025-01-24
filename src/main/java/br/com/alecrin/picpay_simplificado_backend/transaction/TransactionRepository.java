package br.com.alecrin.picpay_simplificado_backend.transaction;

import org.springframework.data.repository.ListCrudRepository;

public interface TransactionRepository extends ListCrudRepository<Transaction, Long> {
    
}
