package br.com.joserljdev.ticketservice.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_tickets")
@Entity
public class Ticket implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer ticketId;

	private Integer numeroPremiado;

	private String status;

	private Integer produtoId;

	public Ticket() {
		super();
	}

	public Ticket(Integer ticketId, Integer numeroPremiado, String status, Integer produtoId) {
		super();
		this.ticketId = ticketId;
		this.numeroPremiado = numeroPremiado;
		this.status = status;
		this.produtoId = produtoId;
	}

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Integer produtoid) {
		this.produtoId = produtoid;
	}

	public Integer getNumeroPremiado() {
		return numeroPremiado;
	}

	public void setNumeroPremiado(Integer numeroPremiado) {
		this.numeroPremiado = numeroPremiado;
	}
}