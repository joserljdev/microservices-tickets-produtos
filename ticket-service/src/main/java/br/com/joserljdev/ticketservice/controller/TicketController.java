package br.com.joserljdev.ticketservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joserljdev.ticketservice.domain.Ticket;
import br.com.joserljdev.ticketservice.repository.TicketRepository;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {

	@Autowired
	private TicketRepository ticketRepository;

	@GetMapping
	public List<Ticket> lista() {
		return ticketRepository.findAll();
	}

	@GetMapping(value = "/{numeroTicket}")
	public Ticket findByTicketId(@PathVariable Integer numeroTicket) {
		return ticketRepository.findTicketByNumeroPremiado(numeroTicket);
	}

	@GetMapping(value = "/produto/{produtoId}")
	public Ticket findByTicketProduto(@PathVariable Integer produtoId) {
		return ticketRepository.findAllByProdutoId(produtoId);
	}
}