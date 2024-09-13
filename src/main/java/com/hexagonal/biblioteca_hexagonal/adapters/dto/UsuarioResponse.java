package com.hexagonal.biblioteca_hexagonal.adapters.dto;

import java.time.LocalDate;

public record UsuarioResponse(
        String nome,
        String email,
        String cpf,
        LocalDate dataDeNascimento,
        String endereco,
        String telefone
) {
}
