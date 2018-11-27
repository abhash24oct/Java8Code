import java.util.function.BiConsumer;

public class ExceptionHandling {

	public static void main(String[] args) {
		 int [] someNumbers = {1,2,3,4,5};
		 int key=2;
		  
		 process(someNumbers, key , ( n,k) ->System.out.println(n+k));
		 
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {

		for (int n : someNumbers) {
			
			biConsumer.accept(n, key);
		}
		
		
	}

	
	
	
}
