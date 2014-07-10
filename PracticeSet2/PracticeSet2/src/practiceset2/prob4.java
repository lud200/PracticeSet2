package practiceset2;
import java.util.*;

/*
 * 
 * Yes it works for generic object, numbers and integers. For generic objects, the class must implement equals method.
 * If it does not work with objects, what would be required to make it work for generic objects?
 * For performing the duplicate removal, equals method must be implemented. 
	
 */
public class prob4 {
static class ProbIterator<E> implements Iterator<E> {
    	
    	E[] array;
    	int currentIndex;

    	ProbIterator(E[] array) {
    		this.array = array;
    	}

		@Override
		public boolean hasNext() {			
			return currentIndex < array.length;
		}

		@Override
		public E next() {
			E result = array[currentIndex];
			while (currentIndex < array.length) {
				if (result == null && array[currentIndex] != null) {
					break;
				} else if (result != null && !result.equals(array[currentIndex])) {
					break;
				}
				currentIndex++;
			}
			return result;
		}

		@Override
		public void remove() {
			throw new RuntimeException("Unimplemented function");
		}
    	
    }

public static void main(String args[]){
	ProbIterator<Integer> ui = new ProbIterator<Integer>(new Integer[] {1, 2, 3, 3, 3, 4, 4, 10, 13, 15, 15, 17});
	while (ui.hasNext())
		System.out.print(ui.next()+" ");
	System.out.println();
}
}
