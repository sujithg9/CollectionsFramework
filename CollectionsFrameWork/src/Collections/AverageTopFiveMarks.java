package Collections;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
class MarksDescending implements Comparator<Integer> {
	 
    @Override
    public int compare(Integer s1, Integer s2) {
        return -s1.compareTo(s2);
    }
}
public class AverageTopFiveMarks {
	public static String[] studentnames = { "Sujith", "Ramakanth", "Siddu" };
	 
    public static int[][] marks = {
        { 60, 70,80,90,40,50,60,70,90,},
            { 80,90,50,70,40,30,20 },
            { 50,60,80,70,40,30,70} };
    
    public static void main(String[] args){
    	Map<String,LinkedList<Integer>> map=new HashMap<String,LinkedList<Integer>>();
    
    	for(int i=0;i<studentnames.length;i++){
    		String studentname=studentnames[i];
    		int[] marksacquired=marks[i];
    		
    		LinkedList<Integer> marksList=new LinkedList<Integer>();
    		for(Integer marks: marksacquired){
    			marksList.add(marks);
    		}
    		Collections.sort(marksList,new MarksDescending());
    		map.put(studentname, marksList);
    	}
    	for (String name : map.keySet()) {
            System.out.print(name);
            System.out.print(": ");
            LinkedList<Integer> marksList = map.get(name);
 
            for (Integer marks : marksList) {
                System.out.print(marks);
                System.out.print(" ");
            }
             
            System.out.println();
        }
    	 System.out.println("The Average of top 5 Marks of each student:");
    for(String name: map.keySet()){
        System.out.print(name);
        System.out.print(": ");
        LinkedList<Integer> marksList = map.get(name);
        List<Integer> topFive=marksList.subList(0, 5);
        int total=0;
        for(Integer marks:topFive){
        	total=marks+total;
        }
        System.out.println(name+"'s Average :"+total/5);
    }
    }
    
}

