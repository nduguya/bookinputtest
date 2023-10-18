package book_input_test;

import java.util.Scanner;

public class Book_Input_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Book mybook = new Book();
		
		
		System.out.println("Please enter the title of the book");
		mybook.title= input.nextLine();
		
		System.out.println("Please enter the author name");
		mybook.author=input.nextLine();
		
		System.out.println("Please enter the number of pages");
		mybook.numberOfPages=input.nextInt();
		
		System.out.println("The book title is: "+ mybook.title);
		
		System.out.println("The book author is: "+ mybook.author);
		
		System.out.println("The book has "+ mybook.numberOfPages + " pages");

	}

}
