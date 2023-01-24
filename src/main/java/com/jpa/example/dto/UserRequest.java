package com.jpa.example.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    @NotNull(message = "First Name Can't be null")
    private String firstName;
    @NotNull(message = "Last Name Can't be null")
    private String lastName;
}
