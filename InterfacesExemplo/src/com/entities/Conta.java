package com.entities;

import com.interfaces.OtherEvent;

public class Conta implements OtherEvent {

	private Pessoa pessoa;
	private String tipo;
	private Integer quantia;

	@Override
	public void action() {
		this.quantia += 100;
	}

	public Conta(Pessoa pessoa, String tipo, Integer quantia) {
		super();
		this.pessoa = pessoa;
		this.tipo = tipo;
		this.quantia = quantia;
	}

	public String toString() {
		return "quantia: " + this.quantia;
	}
}
