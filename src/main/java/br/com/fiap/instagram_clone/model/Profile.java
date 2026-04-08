package br.com.fiap.instagram_clone.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "profiles")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(length = 255)
    private String bio;

    @Column(name = "profile_picture_url", nullable = false)
    private String profilePictureUrl;

    @Column(name = "website", nullable = false)
    private String webSite;
}
