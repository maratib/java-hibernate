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

// 23.0.1 | tem | installed | 23.0.1-tem
// | | 21.0.5 | tem | installed | 21.0.5-tem
// | >>> | 17.0.13 | tem | installed | 17.0.13-tem
// | | 11.0.25 | tem | installed | 11.0.25-tem
// | | 8.0.432 | tem | installed | 8.0.432-tem