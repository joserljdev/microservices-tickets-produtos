package br.com.joserljdev.produtoservice.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.joserljdev.produtoservice.domain.Ticket;

public interface TicketService {

	@GetMapping(value = "/ticket/produto/{produtoId}")
	Ticket findByProdutoId(@PathVariable("produtoId") Integer produtoId);
}