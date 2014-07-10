package practiceset2;

public class prob3 {
	/*Why can't the next estimate, xx, be computed as a / x, where x is the
      previous estimate?
	 * 
	 * If the next estimate is xx=a/x then the next estimate would be a/a/x which will be x again and it
	 * will be moving round and round and would not reduce the error. 
	 * 
	 * What happens, in your implementation, if a = 0?
	 * 
	 * The function returns zero.
	 * 
	 * What value does your program give for square_root(2, 1e-6)?
	 * 
	 * The input is given in the program and it is returning 1.4142135623746899
	 */
	static double square_root(double a, double epsilon) {
		if (Math.abs(a) < epsilon)
			return 0;
		double x = 1.5; 
		while (true) {
			if (Math.abs(x*x - a)<epsilon)
				return x;
			double y = a/x;
			x = (x+y)/2;
		}

	}
	
	public static void main(String[] args){
		System.out.println(square_root(2, 1e-6));
	}
}
