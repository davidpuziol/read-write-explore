package navegar;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//para pegar o que o usuario escreveu
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o path da pasta: ");
		String pathString = sc.nextLine();
		
		File path = new File(pathString);
		
		File[] pastas = path.listFiles(File::isDirectory);
		
		System.out.println("Pastas: ");
		for(File pasta: pastas) {
			System.out.println(pasta);
		}
		
		File[] arquivos = path.listFiles(File::isFile);
		System.out.println();
		System.out.println("Arquivos: ");
		for(File arquivo: arquivos) {
			System.out.println(arquivo);
		}
		
		boolean sucesso = new File(pathString + "/testeDiretorio").mkdir();
		System.out.println("Diretorio criado com sucesso " + sucesso);
		
		sc.close();	
	}
}
