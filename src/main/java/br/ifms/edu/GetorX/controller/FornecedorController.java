package br.ifms.edu.GetorX.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.ifms.edu.GetorX.dto.FornecedorDTO;
import br.ifms.edu.GetorX.model.Fornecedor;
import br.ifms.edu.GetorX.service.FornecedorService;

public class FornecedorController {

    private final FornecedorService service;

    public FornecedorController(FornecedorService service) {
        this.service = service;
    }

    @PostMapping
    public Fornecedor salvar(@RequestBody Fornecedor fornecedor) {
        return service.salvar(fornecedor);
    }

    @GetMapping
    public List<FornecedorDTO> listar() {
        return service.listar();
    }
}
