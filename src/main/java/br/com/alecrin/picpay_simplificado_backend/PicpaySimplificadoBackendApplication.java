package br.com.alecrin.picpay_simplificado_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

@EnableJdbcAuditing
@SpringBootApplication
public class PicpaySimplificadoBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicpaySimplificadoBackendApplication.class, args);
	}

}
