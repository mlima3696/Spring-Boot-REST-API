package projeto.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan(basePackages= {"projeto.api.rest.model"}) // Pode colocar varios pacotes-Criar as tabelas automaticamente
@ComponentScan(basePackages= {"projeto.*"}) // Injetar os objetos/ injeção de depedencia
@EnableJpaRepositories(basePackages = {"projeto.api.rest.repository"}) // Salvar deletar
@EnableTransactionManagement// Gerencia de transação
@EnableWebMvc
@RestController
@EnableAutoConfiguration // Configurar todo o projeto
public class Projetosringapirest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Projetosringapirest1Application.class, args);
	}

}
