package com.example.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class AuthorDto {
    @NotBlank
    @Pattern(regexp = "^[A-Za-z]{3,50}$" , message = "invalid author name")
    private String authorName;
    @Email(message = "invalid emaid given")
    private String email;
}
