import java.sql.SQLException;
import java.util.function.BiConsumer;

public class BetterExceptionHandling {

	public static void main(String[] args) {
		 int [] someNumbers = {1,2,3,4,5};
		 int key=0;
		  
		 process(someNumbers, key , wrapperLambda(( n,k) ->System.out.println(n/k)));
		 
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {

		for (int n : someNumbers) {
			
			biConsumer.accept(n, key);
		}
		
		
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		
		return (v,k) -> {
			try {
				consumer.accept(v, k);
			}catch(Exception e) {
				System.out.println("Error from wrapper method  :: "+e.getMessage());
			}
			
		};
	}
 
	
	
	
}
