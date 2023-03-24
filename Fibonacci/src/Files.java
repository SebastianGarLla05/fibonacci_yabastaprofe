import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Files {

	public Files() {
		
	}
	
	public void paresFile(List<Integer> seriePar) throws IOException {
		File paresFibonacci = new File("paresFibonacci.txt");
		FileWriter escritor = new FileWriter(paresFibonacci);
		escritor.write("Los números pares de la serie Fibonacci hasta 1,000,000 son: \n");
		for (int i = 0; i < 11; i++) {
            int temp = seriePar.get(i);
			escritor.write(temp + ", ");
        }
		escritor.close();
	}
	
	public void imparesFile(List<Integer> serieImpar) throws IOException {
		File imparesFibonacci = new File("imparesFibonacci.txt");
		PrintWriter escritor = new PrintWriter(imparesFibonacci);
		escritor.println("Los números impares de la serie Fibonacci hasta 1,000,000 son: \n");
		for (int i = 0; i < 21; i++) {
            int temp = serieImpar.get(i);
			escritor.write(temp + ", ");
        }
		escritor.close();
	}
}