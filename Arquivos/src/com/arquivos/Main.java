package com.arquivos;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		GerenciadorArquivos gr = new GerenciadorArquivos();

		String file = "//home//maycon//Desktop//ref";
		String palavra = "aula";

		// gr.pesquisarPalavra(file, palavra);
		//gr.quantidadeDePalavras(file);
		gr.gravarTabuada(5);
	}
}
