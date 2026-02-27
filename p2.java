import java.util.Scanner;
class Operation{
public static void main(String[] args){
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter the First Number: ");
	int num1 = sc.nextInt();
	System.out.println("Enter the second number: ");
	int num2 = sc.nextInt();

	int sum = num1 + num2;
	int diff = num1 - num2;
	int product = num1 * num2;
	double n1 = num1;
	double n2 = num2;
	double quotient = n1 / n2;
	
	if(num1 > num2){
		System.out.println("Maximum Num1: "+ num1);
		System.out.println("Minimum Num: " + num2);
	}
	else{
		System.out.println("Maximum Num2: " + num2);
		System.out.println("Minimum Num: " + num1);
	}

	System.out.println("Sum: " + sum);
	System.out.println("Difference: " + diff);
	System.out.println("Product: " + product);
	System.out.println("Quotient: " + quotient);
	
}

}