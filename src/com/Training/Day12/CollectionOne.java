package com.Training.Day12;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OLD style of using collections bEforE GENERICS
		List students = new ArrayList ();
	//	ArrayList students = new ArrayList ();	
		
		//Java Recommends interface driven variable creation and reference
		//I.e If yoU CREATE an object< suggest to refer it with a base interface type
		//i CAN oNLY PUT InTEGERS IN THE coLLECTIon object
		
		
		//adding to colLection
		students.add("mahesh");  //0  
		students.add("Shaaz");  //1
		students.add("mahesh");  //2
		students.add("dipak");  //3
		students.add("Garry");  //4
		
		//PRInt coLLECTiOn
		
		System.out.println("This is the edit from second developer");
		
		//READ an element FROM CoLLECTioN
		
  //   System.out.println(students[2]); arraY STYle not POSSIBLE
	  System.out.println(students.get(3)); 
	  
	  //removing from collection
	  
	  students.remove(3);
	  
	  System.out.println(students);  //NOTIce thaT THE PosItIonS aRE AdJUSTED
	  
		students.add("dipak");  // ALWAYs done at ThE end
		 System.out.println(students);
		 
	 	 
		 students.remove("mahesh") ;  //FIRST OCCurAnCe gets DeleTeD As duplicatES preseNT
		 
		 System.out.println(students);
		 students.add("mahesh");
		 
		boolean b= students.contains("mahesh");
		System.out.println(b);
	
		boolean c= students.contains("maheshRR");
		System.out.println(c);
		
		System.out.println(students.contains("mahesh"));
		
		if(students.contains("Trump") )
			System.out.println("i GOT A MATCH");
		else
			System.out.println("oops");
		
		
		
		students.clear();
		System.out.println(students);
		
		
		students.add("mahesh");  //0  
		students.add("Shaaz");  //1
		students.add("mahesh");  //2
		students.add("dipak");  //3
		students.add("Garry");  //4
		
		System.out.println(students);
		
		students.add(2, "sheela");  //now arrayliST SIzE gEts INCrEAseD
		
		
		System.out.println(students);
		
		int indexOfB= students.indexOf("dipak");
		System.out.println(indexOfB);
		
		Iterator itr = students.iterator();
		
		
		//styLE PRIOR To JAVA 5
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("---------------");
		
		//NEW TYPE oF FOR LOop SINCE JAVA 5
		for (Object object : students) {   
			System.out.println(object);
		}

		//thIS is similr to
		
		while(itr.hasNext()) {
		 	Object name1=  itr.next();  //No caSTiNG nEEdeD
			String name= (String) itr.next();  //explicit CaSting needed
			System.out.println(name);
		}
		
		System.out.println("---------------");
		
		
			
		
	}

}
