import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Manager { 
	
	public Manager() {
	}
	
	public void ejecutar() throws IOException {
		int n = 32; 
	    int t1 = 0, t2 = 1;
	    List<Integer> fibonacci = new ArrayList<Integer>(); 

	    for (int i = 1; i <= n; ++i) {
	    	fibonacci.add(t1);
	    	int sum = t1 + t2;
	        t1 = t2;
	        t2 = sum;
	       }
	    Splitter uno = new Splitter(fibonacci);
	    uno.seriePar();
	}
}