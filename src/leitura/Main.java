package leitura;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	/*
	 * exemplo de como faz a leitura de um arquivo usando a classe scanner, que nao e a melhor opcao para isso
	 */
	public static void main(String[] args) {
		String path = "/home/david/eclipse-workspace/curso_programacao/src/curso_programacao/alunos.txt";
		File file = new File(path);
		
		Scanner sc = null;
		try 
		{
			sc = new Scanner(file);
			while (sc.hasNextLine()) 
			{
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		} 
		finally 
		{
			if (sc != null) 
			{
				sc.close();
			}
		}

	}
}
