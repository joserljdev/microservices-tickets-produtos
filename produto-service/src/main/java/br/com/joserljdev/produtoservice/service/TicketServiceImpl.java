package br.com.joserljdev.produtoservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.joserljdev.produtoservice.domain.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	@LoadBalanced
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "defaulTicket")
	public Ticket findByProdutoId(Integer produtoId) {

		return restTemplate.getForObject("http://TICKET-SERVICE/ticket/produto/{produtoId}", Ticket.class, produtoId);
	}

	private Ticket defaulTicket(Integer produtoId) {
		return new Ticket();
	}
}