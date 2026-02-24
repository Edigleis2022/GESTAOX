package br.ifms.edu.GetorX.repository;

import br.ifms.edu.GetorX.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

    public Fornecedor save(Fornecedor fornecedor);

    public Object findAll();

}
