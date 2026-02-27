import java.util.*;
class operation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		double num = sc.nextDouble();
		
		double ab_value = Math.abs(num);
		double sqr = Math.sqrt(num);
		double power = num * num;
		double sin_value = Math.sin(num);
		double cos_value = Math.cos(num);
		
		System.out.println("Absolute Value: " + ab_value);
		System.out.println("Square root: " + sqr);
		System.out.println("Power(num^2): " + power);
		System.out.println("Sin value: " + sin_value);
		System.out.println("Cos Value: " + cos_value);
}
}