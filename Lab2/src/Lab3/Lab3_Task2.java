package Lab3;
import java.util.Random;

public class Lab3_Task2 {
	public static void main(String[] args) {
        // Create an array of size 100 with random values in the range -100 to 100
        int[] array = new int[100];
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }
        
        // Count the number of pairs of adjacent elements with different values
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                count++;
            }
        }
        
        // Output the result
        System.out.println("Кількість пар сусідніх елементів з різними значеннями: " + count);
    }
}
