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


    public Usuario buscarUsuarioPorEmail(String email){

        return repository.findByEmail(email).orElseThrow(

                () -> new RuntimeException("Email não encontrado!")
        );


    }


    public void deletarUsuarioPorEmail(String email){
        repository.deleteByEmail(email);
    }


    public void atualizarUsuarioPorEmail(String email, Usuario usuario){

        Usuario usuarioEntity = buscarUsuarioPorEmail(email);
        Usuario usuarioAtualizado = Usuario.builder()

                .email(usuario.getEmail() != null ?
                        usuario.getEmail() : usuarioEntity.getEmail())


                .build();


    }
}
