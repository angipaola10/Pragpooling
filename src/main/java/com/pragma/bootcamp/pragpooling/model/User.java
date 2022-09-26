package com.pragma.bootcamp.pragpooling.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "UserRecord")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "Name must not be null")
    private String name;
    @NotNull(message = "LastName must not be null")
    private String lastName;
    @NotNull(message = "Phone must not be null")
    private long phone;
    @NotNull(message = "Address must not be null")
    private String address;
    @NotNull(message = "Email must not be null")
    @Email(message = "Email must be valid")
    private String email;
    @NotNull(message = "Password must not be null")
    @Size(min=8, max=15, message = "Password size must be between 8 and 15")
    private String password;

}
