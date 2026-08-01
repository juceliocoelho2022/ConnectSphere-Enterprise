package com.connectsphere.auth.entity;

import com.connectsphere.auth.domain.entity.BaseEntity;
import com.connectsphere.auth.enums.UserStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private UUID uuid;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserStatus status;

    @Column(nullable = false)
    private Boolean enabled;

    @Column(name = "account_non_locked")
    private Boolean accountNonLocked;

    @Column(name = "credentials_non_expired")
    private Boolean credentialsNonExpired;


    public void prePersist() {

        uuid = UUID.randomUUID();

        enabled = true;

        accountNonLocked = true;

        credentialsNonExpired = true;

        status = UserStatus.ACTIVE;

        createdAt = LocalDateTime.now();

        updatedAt = LocalDateTime.now();

    }


    public void preUpdate() {

        updatedAt = LocalDateTime.now();

    }

}