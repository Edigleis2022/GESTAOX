package br.ifms.edu.GetorX.service;

import java.util.List;

import br.ifms.edu.GetorX.model.Usuario;


public interface UsuarioService {
    Usuario salvar(Usuario usuario);
    List<Usuario> listar();
}
