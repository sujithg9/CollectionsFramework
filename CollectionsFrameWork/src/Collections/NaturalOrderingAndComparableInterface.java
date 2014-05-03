package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
 
class PersonNames implements Comparable<PersonNames> {
    private String name;
     
    public PersonNames(String name) {
        this.name = name;
    }
     
    public String toString() {
        return name;
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        final PersonNames other = (PersonNames) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
 
    @Override
    public int compareTo(PersonNames person) {
        int len1 = name.length();
        int len2 = person.name.length();
         
        if(len1 > len2) {
            return 1;
        }
        else if(len1 < len2) {
            return -1;
        }
        else {
            return name.compareTo(person.name);
        }
    }
}
 
public class NaturalOrderingAndComparableInterface {
 
    public static void main(String[] args) {
        List<PersonNames> list = new ArrayList<PersonNames>();
        SortedSet<PersonNames> set = new TreeSet<PersonNames>();
         
        addElements(list);
        addElements(set);
         
        Collections.sort(list);
         
        showElements(list);
        System.out.println();
        showElements(set);
    }
     
    private static void addElements(Collection<PersonNames> col) {
        col.add(new PersonNames("Joe"));
        col.add(new PersonNames("Sue"));
        col.add(new PersonNames("Juliet"));
        col.add(new PersonNames("Clare"));
        col.add(new PersonNames("Mike"));
    }
     
    private static void showElements(Collection<PersonNames> col) {
        for(PersonNames element: col) {
            System.out.println(element);
        }
    }
 
}