package com.kelsonthony.cameldeveloperdemo.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    @Schema(description = "Nome do usuário", example = "John Doe")
    private String name;

    @Schema(description = "Idade do usuário", example = "30")
    private int age;

    // Getters e Setters
}