package br.com.franklin.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.franklin.drogaria.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Short>{
	
}
