package Lab3;

public class Lab3_Task3 {

	public static void main(String[] args) {
		Matrix matrix = new Matrix(3,4);
		
		matrix.PrintMatrix();
		
		System.out.println("Завдання 1");
		matrix.PrintMaxElementForEachRow();
		
		System.out.println("\nЗавдання 2");
		matrix.FindNegativeMatrixElementsNumber();

		System.out.println("\n\nЗавдання 3");
		Matrix matrix3 = new Matrix(5,4);
		
		matrix3.PrintMatrix();
		matrix3.Print1DArray();
	}

}
