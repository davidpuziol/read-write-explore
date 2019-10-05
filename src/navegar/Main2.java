package navegar;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("ArquivoNovo.txt");
		System.out.println("Name " + file.getName());
		System.out.println("AbsolutePath " + file.getAbsolutePath());
		System.out.println("Parente " + file.getParent());	
	}
}
