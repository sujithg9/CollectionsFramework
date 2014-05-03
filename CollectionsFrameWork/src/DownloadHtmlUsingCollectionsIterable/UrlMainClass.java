package DownloadHtmlUsingCollectionsIterable;

public class UrlMainClass {
public static void main(String[] args){
	UrlLibrary url=new UrlLibrary();
	for(String html:url){
		System.out.println(html.length());
		System.out.println(html);
	}
}
}
