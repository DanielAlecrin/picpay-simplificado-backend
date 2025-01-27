package br.com.alecrin.picpay_simplificado_backend.exception;

public class InvalidTransactionException extends RuntimeException {

    public InvalidTransactionException(String message) {
        super(message);
    }
    
}
