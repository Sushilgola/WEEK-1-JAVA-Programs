import java.util.*;
class operation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		double num = sc.nextDouble();
		
		int int_num = (int) num;
		double d_num = num - int_num;
		double round_up = 0;
		double ceil_num = 0;
		double floor_num = 0;
		if(d_num>0.5){
			round_up += (int_num+1);
		}	
		else{
			round_up = (int) num;
		}
		if(d_num !=0.0){
			ceil_num = ((int) num +1);
		}
		else{
			ceil_num = num;
		}
		if(d_num!=0.0){
			floor_num = (int)num;
		}
				
	
		//System.out.println(d_num);
		System.out.println("NumRound: " + round_up);
		System.out.println("NumCeil: " + ceil_num);
		System.out.println("NumFloor: " + floor_num);
		System.out.println("NumInteger: " + int_num);

		
	}
}