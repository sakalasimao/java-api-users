package com.sakala.cadastro_usuario.infraestruture.repository;

import com.sakala.cadastro_usuario.infraestruture.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {


}
