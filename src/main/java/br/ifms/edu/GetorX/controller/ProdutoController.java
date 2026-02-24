package br.ifms.edu.GetorX.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ifms.edu.GetorX.dto.ProdutoDTO;
import br.ifms.edu.GetorX.model.Produto;
import br.ifms.edu.GetorX.service.ProdutoService;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

    @GetMapping
    public List<ProdutoDTO> listar() {
        return service.listar();
    }
}
