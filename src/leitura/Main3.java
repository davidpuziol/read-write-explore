package leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {
	/*
	 * Exemplo de como ler um arquivo com as classe FileReader e BufferedReader que implementam o stream em arquivo
	 * Esse exemplo utiliza o try with resources para deixar o código mais limpo do que o anterior
	 */

	public static void main(String[] args) {
		String path = "/home/david/eclipse-workspace/curso_programacao/src/curso_programacao/alunos.txt";

		// try com recursos
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}