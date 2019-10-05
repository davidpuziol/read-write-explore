package escrita;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	/*
	 * FileWriter é uma stream basica de escrita de caracteres em arquivos
	 */
	public static void main(String[] args) {
		/*
		 * Se vc passar o path do arquivo na instanciacao de um FileWriter ex: new
		 * FileWriter(path) ele vai criar se nao existir ou recriar o arquivo zerando.
		 * Para abrir como concatenacao faz new FileWriter(path, true)
		 */
		String[] lines = new String[] { "Bom dia", "Boa tarde", "Boa noite" };
		// String path =
		// "/home/david/eclipse-workspace/curso_programacao/src/curso_programacao/out.txt";
		String path = "out.txt";
		//obsever no true abaixo, se tirar ele vai reescrever o arquivo do zero
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
