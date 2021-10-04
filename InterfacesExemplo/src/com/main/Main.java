package com.main;

import java.sql.Timestamp;

import com.entities.Conta;
import com.entities.Pessoa;

public class Main {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Maycon", new Timestamp(System.currentTimeMillis()));

		Conta c1 = new Conta(p1, "Pessoal", 100);
		Conta c2 = new Conta(p1, "Pessoal", 10);
		Conta c3 = new Conta(p1, "Pessoal", 9);

		p1.addConta(c1, c2, c3);
		p1.acionarEvento();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
