package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
//		printing numbers from list using structred apporoach
		List<Integer>numbers = List.of(12 , 9 , 13,4,6,2,4,12,15);
//		printAllNumbersInListFunctional(numbers);
//		printEvenNumbersInListFunctional(numbers);
//		printSquareOfEvenNumbersInListFunctional(numbers);
		printCubesOfOddNumbersInListFunctional(numbers);
	}
private static void print(int number) {
	System.out.println(number);
}
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
	numbers.stream().forEach(FP01Functional::print); // Method Reference(Method1)
	
	numbers.stream().forEach(System.out::println); // Method(2)
		
	}
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
//		numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);//Method Reference(Method1)
		numbers.stream().filter(number->number%2==0).forEach(System.out::println);
	}
	
	private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number->number%2==0)
		.map(number -> number*number)
		.forEach(System.out::println);
	}
	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number->number%2!=0)
		.map(number -> number*number*number)
		.forEach(System.out::println);
	}

	private static boolean isEven(int number) {
		return number%2==0;
	}
}
