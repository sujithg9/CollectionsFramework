package Collections;


public class ArraysSubArrays {
	
	public int[] arrayToSubArray(){
		int[] numberList={1,2,8,3,4,6,7};
		//List<int[]> sublist=Arrays.asList(numberList).subList(2, 4);
		int[] subnumberlist= new int[5];
		for(int i=1;i<=5;i++){
			subnumberlist[i-1]=numberList[i];
		}
		return subnumberlist;
	}
	public static void main(String[] args){
		ArraysSubArrays a=new ArraysSubArrays();
		for(int i=0;i<a.arrayToSubArray().length;i++){
			System.out.println(a.arrayToSubArray()[i]);
		}
	}
}
