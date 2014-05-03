package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FibonacciUsingList {
	public List<Integer> fibonacciSeries(int length){
		List<Integer> fibonacciSeries=new LinkedList<Integer>();
		for(int i=0; i<length;i++){
			if(i==0){
				fibonacciSeries.add(0);
			}else if(i==1){
				fibonacciSeries.add(1);
			}else{
				fibonacciSeries.add(fibonacciSeries.get(i-1)+fibonacciSeries.get(i-2));
			}
		}
		return fibonacciSeries;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		FibonacciUsingList fibonacciUsingList=new FibonacciUsingList();
		System.out.print("Enter the length of Fibonacci:");
		Scanner s=new Scanner(System.in);
		int length=Integer.parseInt(s.next());
		//fibonacciUsingList.fibonacciSeries(5);
		for(Integer i:fibonacciUsingList.fibonacciSeries(length)){
			System.out.println(i);
		}
	}
}
