package com.sakala.cadastro_usuario.controller;


import com.sakala.cadastro_usuario.business.UsuarioService;
import com.sakala.cadastro_usuario.infraestruture.entitys.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario){
        usuarioService.salvarUsuario(usuario);
        return  ResponseEntity.ok().build();

    }


    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam String email){
        return  ResponseEntity.ok(usuarioService.buscarUsuarioPorEmail(email));
    }


    
}
