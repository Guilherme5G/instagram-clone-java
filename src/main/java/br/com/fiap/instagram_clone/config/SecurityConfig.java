package br.com.fiap.instagram_clone.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                // 1. O Spring entende que esta String é um AntPath automaticamente
                .csrf(csrf -> csrf
                        .ignoringRequestMatchers("/h2-console/**")
                )
                // 2. Liberando o acesso sem precisar instanciar classes manuais
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**").permitAll()
                        .anyRequest().authenticated()
                )
                // 3. Essencial para o H2 não ficar com a tela branca
                .headers(headers -> headers
                        .frameOptions(frame -> frame.disable())
                )
                // 4. Ativa o formulário de login padrão do Spring (opcional, mas bom para teste)
                .formLogin(withDefaults())
                .build();
    }
}