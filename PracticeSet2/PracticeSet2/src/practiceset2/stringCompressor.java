package practiceset2;

public class stringCompressor {
	public static void main(String[] args){
		int[] n={ 1, 2, 3, 3, 3, 4, 4, 10, 13, 15, 15, 17 };
		removeDuplicates(n);
		//System.out.println(removeDuplicates(n).length);
	}
	
	public static int[] removeDuplicates(int[] values){
		
		/*
		 * Did you write that as if you were writing production code?
		 * 	Yes I did.
		 * 
		 * What assumptions does your implementation make about the input parameter?
		 *  If the array is not sorted, then perform Quick sort.
		 *  This takes the time complexity of O(nlogn).
		/* NOTE:
		 * 
		 * IF THE INPUT IS A SORTED ARRAY THEN NO NEED TO PERFORM THIS STEP. 
		 * 
		 * IF THE INPUT IS UNSORTED ARRAY THEN PERFORM THIS STEP.
		 */
		/*
		 * 		int low=0;
		 * 		int high=values.length-1;
		 * 		QuickSort(values, low, high);
		*/
		
		/*
		 * What is the algorithmic complexity ("big O") of your function?
		 * 
		 * In this algorithm the time complexity is O(n) for the first loop for removing the duplicate elements +
		 * 
		 * O(nlog n) for performing the sort on the array. 
		 * 
		 * Hence the overall time complexity is O(n)+O(n log n), that is O(n log n) if the array is not sorted and 
		 * 
		 * O(n) if the array is sorted.
		 * 
		 * In my assumption the array is sorted but the implementation for performing sort on huge arrays is also provided
		 * 
		 * One more assumption is that new array is allocated for storing the modified array. No extra data structures are used
		 * 
		 * and only an extra array is used as it is mentioned in the question. 
		 * 
		 * Since this is a smaller array we can come up with bubble sort but I wrote the code by keeping larger arrays in mind.
		 * 
		 * The length of removeDuplicates(x) is 11 and after the operation of removing duplicates is performed it reduces to 8.
		 * 
		 */
		/*
		 * Are you using all the information you have about the input array?
		 * 
		 * Yes I used all the information provided in the input array and I did not use any packages in this program.
		 */
		
		for(int i=0;i<values.length;i++){
			System.out.print(values[i]+"\t");
		}
		System.out.println();
		
		int i=0;
		values[i]=values[0];
		for(int j=0;j<values.length;j++){
			if(values[i]!=values[j]){
				i++;
				values[i]=values[j];
			}
		}
		int[] temp = new int[i+1];
		for(int n=0;n<=i;n++){
			temp[n]=values[n];
		}
		for(int n=0;n<temp.length;n++){
			System.out.print(temp[n]+"\t");
		}
		
		return temp;
	}
	
	public static int[] QuickSort(int[] array, int low, int high){
				
		if(array==null || array.length==0){
			System.out.println("Array is empty");
		}
		if(low>high){
			System.out.println("Invaid");
		}
		
		//Select the pivot item
		
		int middle=low+(high-low)/2;
		
		int pivot=array[middle];
		
		int i=low, j=high;
		
		while(i<=j){
			while(array[i]<pivot){
				i++;
			}
			
			while(array[j]>pivot){
				j++;
			}
			
			if(i<=j){
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				j--;
			}
		}
		
		//Now sort the sub parts of the array.
		
		if(low<j){
			QuickSort(array, low, j);
		}
		
		if(high>i){
			QuickSort(array, i, high);
		}
		return array;
	}
}

