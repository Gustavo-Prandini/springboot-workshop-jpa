package io.github.gustavoprandini.produtosapi.repository;

import io.github.gustavoprandini.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
