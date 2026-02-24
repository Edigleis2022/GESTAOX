package br.ifms.edu.GetorX.service;

import java.util.List;

import br.ifms.edu.GetorX.dto.FornecedorDTO;
import br.ifms.edu.GetorX.model.Fornecedor;

public interface FornecedorService {

    Fornecedor salvar(Fornecedor fornecedor);
    List<FornecedorDTO> listar();
}
