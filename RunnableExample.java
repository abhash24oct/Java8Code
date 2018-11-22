
public class RunnableExample {

	public static void main(String[] args) {
		
		Thread th1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread 1 is running");
			}
		});
		
		th1.start();
		
		new Thread(()->System.out.println("Thread 2 is running")).start();;
	}
}
