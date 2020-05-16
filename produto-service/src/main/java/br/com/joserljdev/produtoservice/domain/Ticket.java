package br.com.joserljdev.produtoservice.domain;

import java.io.Serializable;

public class Ticket implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer ticketId;

	private Integer numeroPremiado;

	private String status;

	public Ticket() {
		super();
	}

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public Integer getNumeroPremiado() {
		return numeroPremiado;
	}

	public void setNumeroPremiado(Integer numeroPremiado) {
		this.numeroPremiado = numeroPremiado;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}