package br.com.alecrin.picpay_simplificado_backend.authorization;

public class UnauthorizedTransactionException extends RuntimeException {
    
    public UnauthorizedTransactionException(String message) {
        super(message);
    }
}
