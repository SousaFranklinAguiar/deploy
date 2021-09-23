package br.com.franklin.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.franklin.drogaria.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Short>{

}
