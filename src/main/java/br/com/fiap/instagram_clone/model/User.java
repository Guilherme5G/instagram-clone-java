package br.com.fiap.instagram_clone.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity // Isso avisa ao Java: "Crie uma tabela no banco para mim"
@Table(name = "users") // O nome da tabela que você escolheu
@Getter @Setter // O Lombok faz os métodos chatos para você
@NoArgsConstructor // Construtor padrão (exigido pelo Java)
@AllArgsConstructor // Construtor com todos os campos

public class User implements UserDetails {

    @Id // Primary Key que você desenhou
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco gera o 1, 2, 3...
    private Long id;

    @Column(unique = true, nullable = false) // "Unique" e "Not Null" do seu diagrama
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Dá a permissão padrão de usuário para quem logar
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Conta nunca expira
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Conta não está bloqueada
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Credenciais (senha) não expiram
    }

    @Override
    public boolean isEnabled() {
        return true; // Conta está ativada
    }}