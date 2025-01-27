package br.com.alecrin.picpay_simplificado_backend.authorization;

public record Authorization(String message) {
    
    public boolean isAuthorized() {
        return message.equals("Autorizado");
    }
}
