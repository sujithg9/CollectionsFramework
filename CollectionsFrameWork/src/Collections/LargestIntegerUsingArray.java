package Collections;

public class LargestIntegerUsingArray {
   public static void main(String[] args){
	   int[] numbers={3,5,22,8,9};
	   int max=numbers[0];
	   for(int i=1;i<numbers.length;i++){
		   if(max<numbers[i]){
			   max=numbers[i];
		   }
	   }
	   System.out.println("The largest Integer is: "+max);
   }
}
