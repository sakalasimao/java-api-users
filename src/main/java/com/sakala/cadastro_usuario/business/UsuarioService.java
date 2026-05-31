package com.sakala.cadastro_usuario.business;

import com.sakala.cadastro_usuario.infraestruture.entitys.Usuario;
import com.sakala.cadastro_usuario.infraestruture.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository){
        this.repository = repository;
    }

    public void salvarUsuario(Usuario usuario){
        repository.saveAndFlush(usuario);

    }



}
