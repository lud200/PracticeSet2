package practiceset2;

import java.util.Scanner;

public class kaperkar_numbers {
	
	public static void main(String[] args){
		
		int n;
		
		System.out.println("Enter a number:");
		
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		int temp=n;
		
		int result, val=0, val2=0, temp1=0;
		
		while(temp%10 != 0){
			
			temp = temp/10;
			
			val++;
			
		}
		
		temp1 = (int) Math.pow(10, val);
		
		result = n*n;
		
		val2 = result%temp1;
				
		for(int i = 0 ; i <= val-1 ; i++){
			
			result = result/10;
			
		}
		
		int finalResult = result + val2;
		
		if(finalResult == n){
			
			System.out.println(n+" is a Kaprekar Number");
			
		}
		else{
			
			System.out.println("Not a Kaprekar Number");
			
		}
		
	}
	
}