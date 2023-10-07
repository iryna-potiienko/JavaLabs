package Lab3;

import java.util.Scanner;

public class Matrix {
	int rowsNumber = 0;
	int columnsNumber = 0;
	int[][] matrix;
	
	public Matrix(int rowsNumber, int colsNumber) {
		this.rowsNumber = rowsNumber;
		this.columnsNumber = colsNumber;
		
		matrix = Create2DRandomArray();
	}
	
	public void PrintMaxElementForEachRow() {
		//matrix = Create2DRandomArray();
		
		int[] maxElementsArray = FindMaxElementForEachRowInMatrix();
		
		for (int i = 0; i < rowsNumber; i++) {
			System.out.println("Максимальний елемент рядка " + i + ": " + maxElementsArray[i]);
		}
		
	}
	
	public int FindNegativeMatrixElementsNumber() {
		int numberNegativeMatrixElements = 0;
		
		for (int i = 0; i < rowsNumber; i++) {
        	for (int j = 0; j < columnsNumber; j++) {
        		if(matrix[i][j] < 0)
        			numberNegativeMatrixElements++;
        	}
        }
		
		System.out.print("Кількість від’ємних елементів матриці: " + numberNegativeMatrixElements);
		
		return numberNegativeMatrixElements;
	}
	
	public void Print1DArray() {
		Scanner scanner = new Scanner(System.in);
      
	    // Input the size of the array
	    System.out.print("Введіть розмір одновимірного масиву: ");
	    int size = scanner.nextInt();
	    int[] array = new int[size];
		
		int maxMatrixElement = FindMaxElementInMatrix();
		int minMatrixElement = FindMinElementInMatrix();
		
		for (int i = 0; i < size; i=i+2) {
			array[i] = maxMatrixElement;
		} 
		
		for (int i = 1; i < size; i=i+2) {
			array[i] = minMatrixElement;
		} 
	
		System.out.println("Одновимірний масив: ");
		for(int element : array)
			System.out.print(element + " ");
	}

	
	private int FindMaxElementInMatrix(){
		int[] maxElementsArray = FindMaxElementForEachRowInMatrix();
		
		int maxElement = FindMaxElementIn1DArray(maxElementsArray);
		
		return maxElement;
	}
	
	public int[] FindMaxElementForEachRowInMatrix() {
		//matrix = Create2DRandomArray();
		
		int[] maxElementsArray = new int[rowsNumber];
		for (int i = 0; i < maxElementsArray.length; i++) {
			maxElementsArray[i] = FindMaxElementIn1DArray(matrix[i]);
		}
		
		return maxElementsArray;	
	}
	
	private int FindMaxElementIn1DArray(int[] array){
		// Find the maximum element in the array
        //int maxIndex = 0;
        int maxElement = array[0];
        
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                //maxIndex = i;
                maxElement = array[i];
            }
        }
        
        return maxElement;
	}
	
	public int FindMinElementInMatrix(){
		
		int[] minElementsArray = new int[rowsNumber];
		for (int i = 0; i < minElementsArray.length; i++) {
			minElementsArray[i] = FindMinElementIn1DArray(matrix[i]);
		}
		
		int minElement = FindMinElementIn1DArray(minElementsArray);
		
		return minElement;
	}
	
	private int FindMinElementIn1DArray(int[] array){
		// Find the minimum element in the array
        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        
        return minElement;
	}
	
	private int[][] Create2DRandomArray (){
//		Scanner scanner = new Scanner(System.in);
//        
//        // Input the size of the array
//        System.out.print("Введіть к-ть рядків матриці (1й вимір двовимірного масиву): ");
//        rowsNumber = scanner.nextInt();
//        System.out.print("Введіть к-ть стовпчиків матриці (2й вимір двовимірного масиву): ");
//        columnsNumber = scanner.nextInt();
        
        // Declare and initialize the array
        int[][] array = new int[rowsNumber][columnsNumber];
        
        // Input elements into the array
        for (int i = 0; i < rowsNumber; i++) {
        	for (int j = 0; j < columnsNumber; j++) {
        		array[i][j] = (int) (Math.random() * 100 - 50);
        	}
        }
               
        return array;       
	}
		
	public void PrintMatrix() {
		System.out.println("Maтриця: " + matrix.length + " на " + matrix[0].length);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++)
			        System.out.print(matrix[i][j] + " ");
			System.out.println();
			}
		
		System.out.println();
	}
}
