package com.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GerenciadorArquivos {

	public void pesquisarPalavra(String arquivo, String palavra) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(arquivo));
		String linha = "";
		StringBuffer buffer = new StringBuffer();

		while (true) {
			if (linha != null) {
				String[] aux = linha.split(" ");

				for (int x = 0; x < aux.length; x++) {

					if (aux[x].equalsIgnoreCase(palavra)) {
						String novaLinha = "\n..." + aux[x - 1] + " " + aux[x] + " " + aux[x + 1] + "...";
						buffer.append(novaLinha);
					}
				}

			} else {
				break;
			}
			
			linha = br.readLine();
		}

		br.close();
		System.out.println(buffer);
	}
}
