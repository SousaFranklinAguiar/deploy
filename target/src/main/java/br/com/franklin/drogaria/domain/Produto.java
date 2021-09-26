package br.com.franklin.drogaria.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short codigo;
	
	@Column(length = 50, nullable = false, unique = true)
	private String nome;
	
	@Column(nullable = false)
	private Byte quantidade;
	
	@Column(nullable = false, precision = 6, scale = 2)
	private BigDecimal preco;
	
	@Column
	private LocalDate dataDeValidade;
	
	@ManyToOne
	@JoinColumn(nullable=false)
	private Categoria categoria;
	
}
