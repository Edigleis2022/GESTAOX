package br.ifms.edu.GetorX.service.impletementacao;

import java.util.List;

import br.ifms.edu.GetorX.dto.ProdutoDTO;
import br.ifms.edu.GetorX.model.Produto;
import br.ifms.edu.GetorX.repository.ProdutoRepository;
import br.ifms.edu.GetorX.service.ProdutoService;

public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoServiceImpl(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public List<ProdutoDTO> listar() {
        return repository.findAll().stream().map(ProdutoDTO::new).toList();
    }

}
