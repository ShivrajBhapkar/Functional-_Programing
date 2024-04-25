package programming;

import java.util.*;
import java.util.function.Predicate;

public class PlayingWithOptional {

	public static void main(String[] args) {
		List<String>fruits = List.of("apple","banana","mango");
		
		Predicate<? super String>predicate = fruit->fruit.startsWith("c");
		Optional<String>optional = fruits.stream().filter(predicate).findFirst();
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
		Optional<String>fruit = optional.of("banana");
		Optional<String>empty = optional.empty();

	}

}
