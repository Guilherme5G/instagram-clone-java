package br.com.fiap.instagram_clone.model;

import jakarta.persistence.*;
import lombok.*;

@Entity // Isso avisa ao Java: "Crie uma tabela no banco para mim"
@Table(name = "users") // O nome da tabela que você escolheu
@Getter @Setter // O Lombok faz os métodos chatos para você
@NoArgsConstructor // Construtor padrão (exigido pelo Java)
@AllArgsConstructor // Construtor com todos os campos

public class User {

    @Id // Primary Key que você desenhou
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco gera o 1, 2, 3...
    private Long id;

    @Column(unique = true, nullable = false) // "Unique" e "Not Null" do seu diagrama
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
}