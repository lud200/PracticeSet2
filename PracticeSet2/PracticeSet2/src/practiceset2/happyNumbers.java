package practiceset2;

public class happyNumbers {
	public static void main(String[] args){
		int n=7;
		int temp1=0, temp2=0;
		temp1=n;
		while(n!=1){
			temp1=n%10;
			temp2=temp1*temp1+temp2;
			n=temp2;
		}
		System.out.println(n);
	}

}
