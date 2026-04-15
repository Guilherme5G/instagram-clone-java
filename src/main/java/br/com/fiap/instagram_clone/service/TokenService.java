package br.com.fiap.instagram_clone.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import br.com.fiap.instagram_clone.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    // chave secreta q vai ser escondida posteriormente
    @Value("${api.security.token.secret}")
    private String secret;

    public String generateToken(User user) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.create()
                    .withIssuer("instagram-clone") // Quem assinou a pulseira
                    .withSubject(user.getEmail())  // De quem é a pulseira
                    .withExpiresAt(genExpirationDate()) // Quando a pulseira perde a validade
                    .sign(algorithm); // Lacra a pulseira
        } catch (JWTCreationException exception) {
            throw new RuntimeException("Erro ao gerar token", exception);
        }
    }

    public String validateToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.require(algorithm)
                    .withIssuer("instagram-clone")
                    .build()
                    .verify(token)
                    .getSubject(); // Se for válido, me devolve o e-mail do dono
        } catch (JWTVerificationException exception) {
            return ""; // Se for falso ou vencido, devolve vazio
        }
    }

    // Define que o token vale por 2 horas (tempo padrão de segurança)
    private Instant genExpirationDate() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }
}