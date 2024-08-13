package ru.kata.spring.boot_security.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Setter
    @Getter
    @Column(name = "role")
    @NonNull
    private String role;


    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role() {
    }

    public Role(Long id) {
        this.id = id;
    }

    public Role(Long id, String role) {
        this.id = id;
        this.role = role;
    }


    @Override
    public String toString() {
        return role;
    }


    @Override
    public String getAuthority() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;
        Role role = (Role) o;
        return getId().equals(role.getId()) && getRole().equals(role.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRole());
    }
}