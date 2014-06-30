package practiceset2;


public class Snippet {
	static final int MAX=100;
	static int lookup[]=new int[MAX];
	static void initialize(){
		for(int i=0;i<MAX;i++){
			lookup[i]=0;
		}
	}
	
	static int fib(int n){
		if(lookup[n]==0){
			if(n<=1){
				lookup[n]=n;
			}
			else{
				lookup[n]=fib(n-1)+fib(n-2);
			}
		}
		return lookup[n];
	}
	public static void main(String[] args) {
		int n=6;
		initialize();
		System.out.println("Fibanacci of "+n+"is "+fib(n));
	}
}

