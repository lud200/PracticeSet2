package practiceset2;
import java.io.*;
import java.util.*;

public class test {
	public static void main(String[] args){	
		HashMap<String, String> h=new HashMap<String, String>();
		h.put("negative", "-");
		h.put("zero", "0");
		h.put("one", "1");
		h.put("two", "2");
		h.put("three", "3");
		h.put("four", "4");
		h.put("five", "5");
		h.put("six", "6");
		h.put("seven", "7");
		h.put("eight", "8");
		h.put("nine", "9");
		h.put("ten", "10");
		h.put("eleven", "11");
		h.put("twelve", "12");
		h.put("thirteen", "13");
		h.put("fourteen", "14");
		h.put("fifteen", "15");
		h.put("sixteen", "16");
		h.put("seventeen", "17");
		h.put("eighteen", "18");
		h.put("nineteen", "19");
		h.put("twenty", "20");
		h.put("thirty", "30");
		h.put("forty", "40");
		h.put("fifty", "50");
		h.put("sixty", "60");
		h.put("seventy", "70");
		h.put("eighty", "80");
		h.put("ninety", "90");
		h.put("hundred", "100");
		h.put("thousand", "1000");
		h.put("million", "1000000");
		String s="one thousand forty nine";
		int total=0;
		String[] s2=s.split(" ");
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<s2.length;i++){
			a.add(Integer.parseInt(h.get(s2[i])));
			//System.out.println(a);
		}
		for(int i=0; i < a.size(); i=i+2){
			
			if(i + 1 < a.size()){
					
					if(a.get(i + 1) % 10 == 0){							
							a.set(i + 1, (a.get(i) * a.get(i + 1)));						
					} else {
						
						a.set(i + 1, (a.get(i) + a.get(i + 1)));
					}
					
					total = total + a.get(i + 1);
			} else {
					if(a.get(i) % 10 == 0)
						total = total * a.get(i);
					else
						total = total + a.get(i);
			}		
		}
		
		System.out.println(total);
	}
}
