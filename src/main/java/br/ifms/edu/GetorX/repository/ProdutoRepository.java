package br.ifms.edu.GetorX.repository;

import br.ifms.edu.GetorX.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public Object findAll();

    public Produto save(Produto produto);

}
