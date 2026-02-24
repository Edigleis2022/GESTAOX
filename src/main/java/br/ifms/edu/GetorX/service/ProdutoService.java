package br.ifms.edu.GetorX.service;

import java.util.List;

import br.ifms.edu.GetorX.dto.ProdutoDTO;
import br.ifms.edu.GetorX.model.Produto;


public interface ProdutoService {
    Produto salvar(Produto produto);
    List<ProdutoDTO> listar();
}
