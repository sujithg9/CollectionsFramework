package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
 
public class ComplexCollections {
 
    public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };
 
    public static String[][] drivers = {
        { "Fred", "Sue", "Pete" },
            { "Sue", "Richard", "Bob", "Fred" },
            { "Pete", "Mary", "Bob" }, };

    public static void main(String[] args){
    
    	Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();
    	
    	for(int i=0;i<vehicles.length;i++){
    		String vehicle=vehicles[i];
    		String[] driveCrew=drivers[i];
    		
    		Set<String> driverSet=new LinkedHashSet<String>(Arrays.asList(driveCrew));
    		
    		personnel.put(vehicle, driverSet);
    	}
    		
    		for (String vehicletype : personnel.keySet()) {
                System.out.print(vehicletype);
                System.out.print(": ");
                Set<String> driversList = personnel.get(vehicletype);
     
                for (String driver : driversList) {
                    System.out.print(driver);
                    System.out.print(" ");
                }
                 
                System.out.println();
            }
    		
    	}
    	
    }
