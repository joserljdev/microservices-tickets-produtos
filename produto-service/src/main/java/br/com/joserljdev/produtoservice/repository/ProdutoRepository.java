package br.com.joserljdev.produtoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joserljdev.produtoservice.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	Produto findByProdutoId(Integer produtoId);
}