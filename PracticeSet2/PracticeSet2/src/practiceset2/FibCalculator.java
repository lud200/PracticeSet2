package practiceset2;
import java.io.*;
import java.util.*;

import javax.net.ssl.SSLContext;

public class FibCalculator {
	
	static final int MAX=100;
	
	static int lookup[]=new int[MAX];
	
	static void initialize(){
		
		for(int i = 0 ; i < MAX ; i++){
			
			lookup[i]=0;
			
		}
		
	}
	
	public static void main(String[] args){
		
		String str;
				
		/*Scanner sc = new Scanner(System.in);
		
		str = sc.next();
		*/
		str="5, 7, 9";
		String[] s = str.split(", ");
		
		int[] a = new int[s.length];
		
		for(int i = 0 ; i < a.length ; i++){
		
			if(a[i]<5000){
			
				a[i] = Integer.parseInt(s[i]);
				
				System.out.print(fib(a[i])+", ");
			
			}
			
			else{
				
				System.out.println("Invalid input");
				
			}
			
		}
		
	}
	
	static int fib( int n ){
		
		if(lookup[n] == 0){
			
			if(n <= 1){
				
				lookup[n]=n;
				
			}
			else{
				
				lookup[n] = fib(n-1) + fib(n-2);
				
			}
			
		}
		
		return lookup[n];
	}

}

/*while(true){
System.out.println("Enter your choice: \n 1. Calculate Fib"+"\n 0: exit");

Scanner sc=new Scanner(System.in);
option=sc.nextInt();
			
switch(option){
case 1:
	System.out.println("Enter your number");
	Scanner s=new Scanner(System.in);
	number=s.nextInt();
	System.out.println(fib(number));
	break;
	
	
case 0: System.exit(0);
}
}*/
