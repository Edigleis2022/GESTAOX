package br.ifms.edu.GetorX.service.impletementacao;

import java.util.List;

import br.ifms.edu.GetorX.dto.FornecedorDTO;
import br.ifms.edu.GetorX.model.Fornecedor;
import br.ifms.edu.GetorX.repository.FornecedorRepository;
import br.ifms.edu.GetorX.service.FornecedorService;

public class FornecedorServiceImpl implements FornecedorService {

    private final FornecedorRepository repository;

    public FornecedorServiceImpl(FornecedorRepository repository) {
        this.repository = repository;
    }

    public Fornecedor salvar(Fornecedor fornecedor) {
        return repository.save(fornecedor);
    }

    public List<FornecedorDTO> listar() {
        return repository.findAll().stream().map(FornecedorDTO::new).toList();
    }

}
