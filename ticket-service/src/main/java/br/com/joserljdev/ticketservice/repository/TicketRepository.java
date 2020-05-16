package br.com.joserljdev.ticketservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joserljdev.ticketservice.domain.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
	Ticket findTicketByNumeroPremiado(Integer numeroPremiado);

	Ticket findAllByProdutoId(Integer produtoId);
}