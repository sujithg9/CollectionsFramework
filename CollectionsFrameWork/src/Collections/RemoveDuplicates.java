package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
public static void main(String[] args){
	String name="sujiths";
	String nameWithoutDups ="";
	LinkedHashSet<String> set=new LinkedHashSet<>();
	for(char s:name.toCharArray()){
		String str= String.valueOf(s);
		set.add(str);	
	}
//	for(String dupremvname:set){
//		nameWithoutDups+=dupremvname;
	
//	}
//	
	
//	for(String du:set){
//		System.out.println(du);
//		if(du.equals("u")){
//			set.remove(du);
//		}
//	}
	Iterator<String> it = set.iterator();
	while(it.hasNext()){
		nameWithoutDups+=it.next();
	}
	System.out.println(nameWithoutDups);
}
}
