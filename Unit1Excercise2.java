import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Excercise2 {

	public static void main(String[] args) {
		
		List<Person> personList1 = Arrays.asList(
					new Person("Charles", "Dickens", 66),
					new Person("Luis", "Caroll", 78),
					new Person("Thomas","Caryle",88),
					new Person("Charlotte", "Bronte", 45),
					new Person("Mathew", "Arnold", 41)
				);
		
		List<Person> personList2 = Arrays.asList(
				new Person("Charles", "Dickens", 66),
				new Person("Luis", "Caroll", 78),
				new Person("Thomas","Caryle",88),
				new Person("Charlotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 41)
			);
		
		Collections.sort(personList2,(Person p1, Person p2) -> p1.getAge()- p2.getAge());
		
		performConditionallyPredicate(personList2, p -> true,p -> System.out.println(p));
		
		performConditionallyPredicate(personList2, (p) -> p.getLname().startsWith("C"),p-> System.out.println(p));
		
		
	}
	
	

	//Here we can use a function from java.util.function package 
	private static void performConditionallyPredicate(List<Person> personList1, Predicate<Person> predicate,Consumer<Person> consumer) {
		
		for (Person person : personList1) {
			
			if(predicate.test(person))
				consumer.accept(person);
		}
	}
	
}
