package day_5;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		    HashSet<String> set=new HashSet<>();  
		           set.add("66");    
		           set.add("T77");    
		           set.add("00");   
		           set.add("12");  
		           set.add("-1");  
		           Iterator<String> i=set.iterator();  
		           while(i.hasNext())  
		           {  
		           System.out.println(i.next());  
		           }  
		 }  
		}  

