package com.hexagonal.biblioteca_hexagonal.core.service;

import com.hexagonal.biblioteca_hexagonal.core.domain.Usuario;
import com.hexagonal.biblioteca_hexagonal.core.ports.UsuarioServicePort;

public class UsuarioService implements UsuarioServicePort {

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuario;
    }

}

