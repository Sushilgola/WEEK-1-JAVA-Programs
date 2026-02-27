import java.util.Scanner;
class Temprature{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("How many value you want to Enter: ");
	int n = sc.nextInt();
	int flag = 1;
	Double[] arr = new Double[n];
	
	
	System.out.println("Enter the Values: ");
	for(int i=0; i<n; i++){
		arr[i] = sc.nextDouble();
	}
	
	System.out.println("\tS.no. \tInput(Fahrenheit) \t Output(celcius)");
	for(int i=0; i<n; i++){
		double cel = arr[i] - 32/1.8;
		System.out.println("\t" + i +"\t\t" + arr[i] + "\t\t\t" + cel);
	}
	
	
}
}