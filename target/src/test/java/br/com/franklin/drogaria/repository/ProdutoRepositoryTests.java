package br.com.franklin.drogaria.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.franklin.drogaria.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Test
	public void inserir() {
		Produto p = new Produto(
		Short.valueOf("1"), 
		"Arroz", 
		Byte.valueOf("15"), 
		BigDecimal.valueOf(4.5), 
		LocalDate.of(2021, 6, 10),
		null);
		
		produtoRepository.save(p);
	}
}
