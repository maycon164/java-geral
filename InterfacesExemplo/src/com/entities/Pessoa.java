package com.entities;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.interfaces.OtherEvent;

public class Pessoa {
	private String name;
	private Timestamp data;
	private List<OtherEvent> contas = new ArrayList<>();

	public Pessoa(String name, Timestamp data) {
		super();
		this.name = name;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}
	
	public void acionarEvento() {
		contas.forEach(item -> item.action());
	}
	
	public void addConta(OtherEvent ...conta) {
		this.contas.addAll(Arrays.asList(conta));
	}
	
}

