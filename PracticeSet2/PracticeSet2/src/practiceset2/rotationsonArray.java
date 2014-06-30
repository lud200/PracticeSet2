package practiceset2;

public class rotationsonArray {
	public static void main(String args[]){
		int[] a={4, 6, 1, 2, 3};
		System.out.println(arrayrotation(a));
	}
	
	public static int arrayrotation(int[] a){
		
		int start=0, end;
		end=a.length-1;
		while(start<end){
			if(a[start]<a[end])
				return end+1;
			else{
				int mid=(start+end)/2;
				if(a[start]<a[mid] && a[mid+1]<a[end]){
					return mid+1;
				}
				else if(a[start]<a[mid]){
					start=mid+1;
				}
				else{
					end=mid-1;
				}
			}
		}
		return -1;
	}

}
