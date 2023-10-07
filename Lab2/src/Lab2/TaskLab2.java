package Lab2;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author ZOIPOTII
 *
 */
public class TaskLab2 {
	void Task1() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	void Task2() {
		for(int i=5; i>=1; i--) {
			System.out.println(i);
		}
	}
	
	void Task3() {
		for(int i=1; i<=9; i++) {
			System.out.println("\n" + i);
			for (int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j );
			}
		}
	}
	
	void Task4() {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter positive number: ");
	    int number = console.nextInt();

	    if (number<=0) {
	    	System.out.println("Please enter positive number! ");
	    	return;
	    }
	    int sum = 0;
	    for(int i=1; i<=number; i++) {
	    	sum += i;
			//System.out.println(sum);
		}
	    System.out.println("Sum = " + sum);
	}
	
	void Task5() {
		while (true) {
			Scanner console = new Scanner(System.in);
			System.out.println("Enter number1 : ");
		    int number1 = console.nextInt();
		    
		    if(number1 == 1) break;
		    
		    System.out.println("Enter number2 : ");
		    int number2 = console.nextInt();
		    
		    System.out.println(number1 + " * " + number2 + " = " + number1*number2);
		}
	}
}
