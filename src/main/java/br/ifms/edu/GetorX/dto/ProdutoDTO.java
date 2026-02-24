package br.ifms.edu.GetorX.dto;

import br.ifms.edu.GetorX.model.Produto;
import lombok.Data;


@Data
public class ProdutoDTO {

    private Long id;
    private String nome;
    private Double valor;

    public ProdutoDTO(Produto produto) {
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.valor = produto.getValor();
    }
}
