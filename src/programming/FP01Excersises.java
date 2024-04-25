package programming;

import java.util.List;

public class FP01Excersises {

	public static void main(String[] args) {
// Ex-01
//		List<Integer>numbers = List.of(12 , 9 , 13,4,6,2,4,12,15);
//		printEvenNumbersInListFunctional(numbers);
		
//		Ex-02
		List<String>courses = List.of("Spring","Spring Boot" , "API",
				                         "Microserices","AWS","PCF",
				                         "Azure");
//		printAllCourses(courses);
//		printAllCoursesWithSpring(courses);
//		printAllCoursesWithFourLetter(courses);
		printLengthOfAllCourses(courses);
	}

	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number->number%2!=0).forEach(System.out::println);
	}

	private static void printAllCourses(List<String>courses) {
		courses.stream().forEach(System.out::println);
	}
	private static void printAllCoursesWithSpring(List<String>courses){
		courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
	}
	private static void printAllCoursesWithFourLetter(List<String>courses){
		courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
	}
	
	private static void printLengthOfAllCourses(List<String>courses){
		courses.stream()
		.map(course->course+" "+course.length())
		.forEach(System.out::println);
	}
	
}
