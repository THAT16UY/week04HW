package Week4hw;

//import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class codingProject {
	
	public static void main(String[] args){
		List<Integer> ages = new ArrayList<Integer>(); // Step 1.a
		
		ages.add(3);
		ages.add(9);
		ages.add(23);
		ages.add(64);
		ages.add(2);
		ages.add(8);
		ages.add(28);
		ages.add(93);
		System.out.println("Step 1.a: " + (ages.get(ages.size() - 1) - ages.get(0)));
	
		int[] ages2 = {1, 2, 3, 4, 5, 6, 7 ,8 ,9}; // Step 1.b
		System.out.println("Step 1.b: " + (ages2[ages2.length - 1] - ages2[0]));
	
		int total = 0;
		for(int i = 0; i < ages2.length; i++) {
			total += ages2[i];
		}
		System.out.println("Step 1.c " + total / ages2.length);	
	
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
		int nameTotal = 0;
	
		for(String string : names) { // Step 2.a
			nameTotal += string.length();
		}
		System.out.println("Step 2.a " + nameTotal / names.length);
	
		StringBuilder sb = new StringBuilder(); // Step 2.b
		String space = " ";
		for(String string2 : names) {
			sb.append(string2);
			sb.append(space);
		}
		System.out.println("Step 2.b " + sb);
		
	

		// Step 3 - To access the last element in the array it should be written as array[array.length() - 1].
	
		// Step 4 - To access the first element in the array it should be written as array[0].
	
		List<Integer> nameLength = new ArrayList<Integer>(); // Step 5
		for(String string3 : names) {
			nameLength.add(string3.length());
		}
		System.out.println("part 5 " + nameLength);
		
		int nameLengthSum = 0; // Step 6
		
		for(int i : nameLength) {
			nameLengthSum += i;
		}
		
		System.out.println("part 6 " + (nameLengthSum / nameLength.size()));
		
		System.out.println("part 7 " + part7("Hello", 3)); //part 7
		
		System.out.println("part 8 " + part8("Ethan","Noell")); // part 8
		
		int[] arr100 = {12,50,3,91,4};
		
		System.out.println("part 9 " + part9(arr100));// part 9 
		
		double[] arr = {12.5, 15.6};
		double[] arr2 = {1.5, 2.8, 6.12, 90.0};
		
		System.out.println("part 10 " + part10(arr));// part10
		
		System.out.println("part 11 "+ part11(arr, arr2));// part 11
		
		boolean isHotOutside = true;
		double moneyInPocket = 20.0;
		
		System.out.println("part 12 " + willBuyDrink(isHotOutside, moneyInPocket));// part 12
		
		System.out.println("part 13 " + add(12, 41));
		
	}
	
	public static String part7(String word, int n) { // part 7 : prints a word a certain amount of times
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(word);
		}
		return sb.toString();
	}
	
	public static String part8 (String firstName, String lastName) { // part 8 : combines to string to create a full name
		String Space = " ";
		StringBuilder sb = new StringBuilder();
		
		sb.append(firstName);
		sb.append(Space);
		sb.append(lastName);
		return sb.toString();
	}
	
	public static boolean part9(int[] arr) { // part 9 returns true if the sum of the array is greater then 100.
		int sum = 0;
		for(int i = 0 ; i < arr.length; i++) {
			sum += arr[i];
		}
		return(sum > 100);
	}
	
	public static double part10(double[] arr) { //Find the average of a double array.

		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
	
	public static boolean part11(double[] arr, double[] arr2) { // return true if the sum of array 1 is greater then arrray2

		double sum1 = 0;
		double sum2 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum1 += arr[i];
		}
		for(int i = 0; i < arr2.length; i++) {
			sum2 += arr2[i];
		}
		return sum1 > sum2;
	}
	
	public static boolean willBuyDrink(boolean isHot , double money) { // Will return true if its hot and have more then 10.50 
		if(isHot == true && money > 10.50) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int add(int a, int b) {// adds two numbers together
		return a + b;
	}
	
	
}
