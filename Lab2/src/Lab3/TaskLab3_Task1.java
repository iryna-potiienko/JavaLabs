package Lab3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TaskLab3_Task1 {
	void Task1() {
		int[] nums = { 3, 1, 6, 4, 0, 9, 5, 8, 2 }; 
		System.out.println("Масив: " + Arrays.toString(nums));
		int val = 0;
		int foundNum = -1; 
		
		// шукаємо значення 0 в масиві
		for (int i=0; i < nums.length; i++) { 
			if (nums[i] == val) { 
				foundNum = i; 
				break; 
		          }
			} 
		
		if (foundNum != -1) { 
			System.out.println("Номер першого нульового елемента: " + foundNum); 
		}
		else {
			System.out.println("Масив не містить нульових елементів"); 
		}

	}
	
	void Task2() {
		double[] nums = { 3, 1, 6, 4, 0, 9, 5, 8, 2 }; 
		System.out.println(Arrays.toString(nums));

		for (int i=1; i < nums.length-1; i++) { 
			nums[i] = (nums[i-1] + nums [i+1]) / 2;
			} 
		
		System.out.println("Трансформований масив: " + Arrays.toString(nums));
	}
	
	void Task3() {
		Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        
        // Declare and initialize the array
        double[] array = new double[size];
        
        // Input elements into the array
        System.out.println("Введіть елементи масиву: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        
        // Find the minimum element in the array
        double minElement = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        
        // Find the indices of the first and last positive elements
        int firstPositiveIndex = -1;
        int lastPositiveIndex = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                if (firstPositiveIndex == -1) {
                    firstPositiveIndex = i;
                }
                lastPositiveIndex = i;
            }
        }
        
        // Calculate the sum of elements between the first and last positive elements
        double sumBetweenPositives = 0;
        if (firstPositiveIndex != -1 && lastPositiveIndex != -1) {
            for (int i = firstPositiveIndex + 1; i < lastPositiveIndex; i++) {
                sumBetweenPositives += array[i];
            }
        }
        
        // Transform the array as specified
        double[] transformedArray = new double[size];
        int zeroCount = 0;
        int otherCount = size - 1;
        
        for (double element : array) {
            if (element == 0) {
                transformedArray[zeroCount++] = element;
            }
        }
        
        for (double element : array) {
            if (element != 0) {
                transformedArray[zeroCount++] = element;
            }
        }
        
        // Output the results
        System.out.println("Мінімальний елемент масиву: " + minElement);
        System.out.println("Сума елементів масиву, розташованих між першим і останнім додатними елементами: " + sumBetweenPositives);
        System.out.println("Трансформований масив: ");
        for (double element : transformedArray) {
            System.out.print(element + " ");
        }
        
        //scanner.close();
	}
	
	void Task4() {
		Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        
        // Declare and initialize the array
        int[] array = new int[size];
        
        // Input elements into the array
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Find the index of the maximum element in the array
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        
        // Find the indices of the first and second zero elements
        int firstZeroIndex = -1;
        int secondZeroIndex = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                if (firstZeroIndex == -1) {
                    firstZeroIndex = i;
                } else {
                    secondZeroIndex = i;
                    break; // Exit the loop after finding the second zero
                }
            }
        }
        
        // Calculate the product of elements between the first and second zero elements
        int productBetweenZeros = 1;
        if (firstZeroIndex != -1 && secondZeroIndex != -1) {
            for (int i = firstZeroIndex + 1; i < secondZeroIndex; i++) {
                productBetweenZeros *= array[i];
            }
        }
        
        // Transform the array as specified
        int[] transformedArray = new int[size];
        
        // Place elements from odd positions in the first half and even positions in the second half
        int firstHalfIndex = 0;
        int secondHalfIndex = size / 2;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                transformedArray[firstHalfIndex] = array[i];
                firstHalfIndex++;
            } else {
                transformedArray[secondHalfIndex] = array[i];
                secondHalfIndex++;
            }
        }
        
        // Output the results in Ukrainian
        System.out.println("Індекс максимального елемента в масиві: " + maxIndex);
        System.out.println("Добуток елементів між першим і другим нульовими елементами: " + productBetweenZeros);
        System.out.println("Трансформований масив: ");
        for (int element : transformedArray) {
            System.out.print(element + " ");
        }
        
        //scanner.close();
	}
	
	void Task5() {
		Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        
        // Declare and initialize the array
        double[] array = new double[size];
        
        // Input elements into the array
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        
        // Calculate the product of positive elements in the array
        double productOfPositives = 1;
        for (double element : array) {
            if (element > 0) {
                productOfPositives *= element;
            }
        }
        
        // Find the index of the minimum element in the array
        int minIndex = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        
        // Calculate the sum of elements before the minimum element
        double sumBeforeMin = 0;
        for (int i = 0; i < minIndex; i++) {
            sumBeforeMin += array[i];
        }
        
        // Separate the elements into two arrays: even-indexed and odd-indexed
        double[] evenElements = new double[size / 2];
        double[] oddElements = new double[size - size / 2];
        
        int evenIndex = 0;
        int oddIndex = 0;
        
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                evenElements[evenIndex++] = array[i];
            } else {
                oddElements[oddIndex++] = array[i];
            }
        }
        
        // Sort the even and odd element arrays in ascending order
        Arrays.sort(evenElements);
        Arrays.sort(oddElements);
        
        // Output the results
        System.out.println("Добуток додатних елементів масиву: " + productOfPositives);
        System.out.println("Сума елементів масиву до мінімального елемента: " + sumBeforeMin);
        
        System.out.println("Елементи, що розташовані на парних місцях (за зростанням):");
        for (double element : evenElements) {
            System.out.print(element + " ");
        }
        
        System.out.println("\nЕлементи, що розташовані на непарних місцях (за зростанням):");
        for (double element : oddElements) {
            System.out.print(element + " ");
        }
        
        //scanner.close();
	}
	
	void Task6() {
		Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        
        // Declare and initialize the array
        double[] array = new double[size];
        
        // Input elements into the array
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        
        // Input the range A and B
        System.out.print("Введіть діапазон A: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть діапазон B: ");
        double b = scanner.nextDouble();
        
        // Calculate the count of elements within the range [A, B]
        int countInRange = 0;
        for (double element : array) {
            if (element >= a && element <= b) {
                countInRange++;
            }
        }
        
        // Find the index of the maximum element in the array
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        
        // Calculate the sum of elements after the maximum element
        double sumAfterMax = 0;
        for (int i = maxIndex + 1; i < size; i++) {
            sumAfterMax += array[i];
        }
        
        // Sort the array in descending order of the absolute values of elements       
        Double[] absoluteArray = new Double[size];
        int i = 0;
        
        for(Double element: array) {
        	absoluteArray[i] = Math.abs(element);
        	i++;
        }
        Arrays.sort(absoluteArray, Collections.reverseOrder());
        
        // Output the results
        System.out.println("Кількість елементів масиву, що лежать у діапазоні [A; B]: " + countInRange);
        System.out.println("Сума елементів масиву, розташованих після максимального елемента: " + sumAfterMax);
        
        System.out.println("Елементи масиву за спаданням модулів елементів:");
        for (double element : absoluteArray) {
            System.out.print(element + " ");
        }
        
        //scanner.close();
	}
}
