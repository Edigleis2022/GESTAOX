package br.ifms.edu.GetorX.dto;

import br.ifms.edu.GetorX.model.Fornecedor;

public class FornecedorDTO {

    private Long id;
    private String nome;

    public FornecedorDTO(Fornecedor fornecedor) {
        this.id = fornecedor.getId();
        this.nome = fornecedor.getNome();
    }
}
