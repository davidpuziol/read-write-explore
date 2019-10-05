package leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
	/*
	 * Exemplo de como ler um arquivo com as classe FileReader e BufferedReader que implementam o stream em arquivo
	 * Esse exemplo seria a forma mais feia e manual de se fazer. 
	 */

	public static void main(String[] args) {
		String path = "/home/david/eclipse-workspace/curso_programacao/src/curso_programacao/aluno.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try 
		{
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) 
		{
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try
			{
				 if (br != null ) {
					 br.close();
				 }
				 if(fr != null) {
					 fr.close();
				 }				
			}
			catch(IOException e) 
			{
				System.out.println("Error: " + e.getMessage());
			}
		}
	}

}
