package com.hexagonal.biblioteca_hexagonal.adapters.dto;

import java.time.LocalDate;

public record UsuarioRequest(
        String nome,
        String email,
        String senha,
        String cpf,
        LocalDate dataDeNascimento,
        String endereco,
        String telefone
) {
}

