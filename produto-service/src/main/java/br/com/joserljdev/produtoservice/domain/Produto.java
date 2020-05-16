package br.com.joserljdev.produtoservice.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name = "tb_produtos")
@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	Integer produtoId;

	String produtoName;

	@Transient
	Ticket ticket;

	public Produto() {
		super();
	}

	public Produto(Integer produtoId, String produtoName) {
		super();
		this.produtoId = produtoId;
		this.produtoName = produtoName;
	}

	public Integer getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Integer produtoId) {
		this.produtoId = produtoId;
	}

	public String getProdutoName() {
		return produtoName;
	}

	public void setProdutoName(String produtoName) {
		this.produtoName = produtoName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
}