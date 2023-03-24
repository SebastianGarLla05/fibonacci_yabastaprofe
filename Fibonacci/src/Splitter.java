import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Splitter {

	List<Integer> fibonacci = new ArrayList<>();
	
	public Splitter(List<Integer> fibonacci) {
		this.fibonacci = fibonacci;
	}
	
	public void seriePar() throws IOException {
		List<Integer> seriePar = new ArrayList<>();
		List<Integer> serieImpar = new ArrayList<>();
		for(int i = 0; i < 32; i++) {
			if(fibonacci.get(i) % 2 == 0) {
				int num = fibonacci.get(i);
				seriePar.add(num);
			} else {
				serieImpar.add(fibonacci.get(i));
			}
		}
		Files files = new Files();
		files.paresFile(seriePar);
		files.imparesFile(serieImpar);
	}
}