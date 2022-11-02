package com.tolgabayrak.springserver.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    private Long id;
    private String fullName;
    private String email;
    private String password;

}
