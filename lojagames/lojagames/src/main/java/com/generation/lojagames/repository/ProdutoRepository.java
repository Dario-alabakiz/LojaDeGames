package com.generation.lojagames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

	//Vai buscar o preço maior
	public List <Produto> findAllByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	//Vai buscar o preço menor 
	public List <Produto> findAllByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);

}
