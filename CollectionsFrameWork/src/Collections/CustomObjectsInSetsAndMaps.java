package Collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
 
class Person implements Comparable<Person> {
    private int id;
    private String name;
     
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
     
    public String toString() {
        return "{ID is: " + id + "; name is: " + name + "}";
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person p1) {
		if(p1.id>Person.this.id){
			return 1;
		}
		if(p1.id<Person.this.id){
			return -1;
		}
		return 0;
	}
 
   
     
     
}
 
 
public class CustomObjectsInSetsAndMaps {
 
    public static void main(String[] args) {
         
        Person p1 = new Person(0, "Bob");
        Person p2 = new Person(1, "Sue");
        Person p3 = new Person(2, "Mike");
        Person p4 = new Person(1, "Sue");
         
        Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
         
        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 1);
         
        for(Person key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
         
        Set<Person> set = new LinkedHashSet<Person>();
         
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
         
        System.out.println(set);
    
        
        Set<Person> treeSet = new TreeSet<Person>();
        
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        
        System.out.println("treeset"+ treeSet);
        
    }
    
    
 
}