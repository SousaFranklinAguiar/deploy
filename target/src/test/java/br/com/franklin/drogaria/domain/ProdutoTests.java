package br.com.franklin.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTests {
	
	@Test
	public void criar() {
		Produto p = new Produto(
				Short.valueOf("1"), 
				"Arroz", 
				Byte.valueOf("15"), 
				BigDecimal.valueOf(4.5), 
				LocalDate.of(2021, 6, 10),
				null);
		
		System.out.println(p);
	}
	
}
