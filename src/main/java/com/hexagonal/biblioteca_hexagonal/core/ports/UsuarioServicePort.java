package com.hexagonal.biblioteca_hexagonal.core.ports;

import com.hexagonal.biblioteca_hexagonal.core.domain.Usuario;

public interface UsuarioServicePort {

    Usuario createUsuario (Usuario usuario);

}

