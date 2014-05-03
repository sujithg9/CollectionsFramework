package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReversingEachWord {
	public void reverseSeperatedWorkds(ArrayList<String> words){
		
		StringBuilder builder;
		ArrayList<String> tempArrayList=new ArrayList<String>();
		for(String word:words){
			builder=new StringBuilder(word);
			builder.reverse();
			tempArrayList.add(String.valueOf(builder));
		}
		reversedWordsSentence(tempArrayList);
	}
	public void reversedWordsSentence(ArrayList<String> reversedWords){
		StringBuilder builder = new StringBuilder();
		for(String words: reversedWords){
			builder.append(words+" ");
		}
		System.out.println(builder);
	}
	public static void main(String[] args){
		ReversingEachWord eachWord=new ReversingEachWord();
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a Sentence:");
		String sentence=sn.nextLine();
		ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList(sentence.split(" ")));
		eachWord.reverseSeperatedWorkds(arrayList);
	}
}
