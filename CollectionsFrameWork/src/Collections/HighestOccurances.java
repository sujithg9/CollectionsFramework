package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HighestOccurances {
	public static final ArrayList<Integer> numbers=new ArrayList<Integer>();
	public void findOccuranceCount(){
		ArrayList<Integer> numbers= HighestOccurances.numbers;
		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		numbers.add(3);
		numbers.add(3);
		HashMap<Integer,Integer> counts = new HashMap<Integer, Integer>();
		for (Integer n : numbers) {
			if (counts.containsKey(n)) {
				counts.put(n, counts.get(n) + 1);
			} else {
				counts.put(n, 1);
			}
		}
		findMaxOccurances(counts);
	}
	public boolean findMaxOccurances(HashMap<Integer,Integer> numbers){
		boolean b=true;
		ArrayList<Integer> tempList=new ArrayList<Integer>();
		for(Integer key:numbers.keySet()){
			int value=numbers.get(key);
			tempList.add(value);
		}
		Collections.sort(tempList,new Comparator<Integer>() {

			@Override
			public int compare(Integer n1, Integer n2) {

				return -n1.compareTo(n2);
			}
		});
		if(tempList.get(0)==tempList.get(1)){
			b=false;
			System.out.println("There are multiple repeated numebers with high count");
			for(Map.Entry<Integer, Integer> e: numbers.entrySet()){
				Integer key=e.getKey();
				if(numbers.get(key).equals(tempList.get(0))){
					System.out.println(e);
				}
			}
		}else{
			for(Integer key: numbers.keySet()){
				if(numbers.get(key).equals(tempList.get(0))){
					System.out.println("The Highest repeated number is:"+key);
				}
			}	
		}
		System.out.println(b);
		return b;
	}
	public static void main(String[] args){
		HighestOccurances highestOccurances=new HighestOccurances();
		highestOccurances.findOccuranceCount();
		System.gc();
	}
}


