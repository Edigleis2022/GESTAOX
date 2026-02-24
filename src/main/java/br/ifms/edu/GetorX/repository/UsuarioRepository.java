package br.ifms.edu.GetorX.repository;

import java.util.List;

import br.ifms.edu.GetorX.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    public List<Usuario> findAll();

    public Usuario save(Usuario usuario);

}
