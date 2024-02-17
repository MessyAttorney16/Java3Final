package com.example.java4finalproject;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.autoconfigure.domain.EntityScan;

public class User {

    @Getter
    @Setter
    @NotNull(message = "Must enter first name")
    private String firstName;

    @Getter
    @Setter
    @NotNull(message = "Must enter last name")
    private String lastName;

    @Getter
    @Setter
    @NotNull(message = "Must enter username")
    @Length(message = "Username must be at least 6 characters long")
    private String username;






}
