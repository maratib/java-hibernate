package com.mak;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// import javax.persistence.*;

import jakarta.persistence.*;

@Getter
@Setter
@ToString

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
}
