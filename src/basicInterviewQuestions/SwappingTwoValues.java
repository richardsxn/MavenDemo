package basicInterviewQuestions;

import java.util.Scanner;

public class SwappingTwoValues {

	public static void main(String[] args) {
		
		int x,y,temp;
		System.out.println("Enter x and y ");
		Scanner in = new Scanner(System.in);
		x= in.nextInt();
		y= in.nextInt();
		System.out.println("Before swapping" + x+y );
		temp =x;
		x=y;
		y=temp;
		System.out.println("After swapping" + x+y );
		
	}

}
