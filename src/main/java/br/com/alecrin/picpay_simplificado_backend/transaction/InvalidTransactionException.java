package br.com.alecrin.picpay_simplificado_backend.transaction;

public class InvalidTransactionException extends RuntimeException {

    public InvalidTransactionException(String message) {
        super(message);
    }
    
}
