package br.com.fiap.instagram_clone;

import br.com.fiap.instagram_clone.model.User;
import br.com.fiap.instagram_clone.repository.UserRepository;
import br.com.fiap.instagram_clone.service.TokenService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InstagramCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstagramCloneApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repository, TokenService tokenService) {
		return (args) -> {
			User testUser = new User();
			testUser.setUsername("gui_moreira");
			testUser.setEmail("guilherme@fiap.com.br");
			testUser.setPassword("senha123");
			repository.save(testUser);


			User user = repository.findByEmail("guilherme@fiap.com.br").orElse(null);

			if (user != null) {
				String token = tokenService.generateToken(user);

				System.out.println("\n=========================================");
				System.out.println("TOKEN JWT GERADO:");
				System.out.println(token);
				System.out.println("=========================================\n");

				String emailValidado = tokenService.validateToken(token);
				System.out.println("🔍 DONO DO TOKEN: " + emailValidado);
			} else {
				System.out.println("❌ ERRO: Usuário não encontrado no banco!");
			}
		};
	}}