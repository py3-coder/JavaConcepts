package CoreJava;

import java.util.List;

import CoreJava.GenericClass.BoundedGeneric;
import CoreJava.GenericClass.Print;
import CoreJava.GenericClass.PrintPair;

public class Main {

	public static void main(String[] args) {
		
//		//  Generic Class Single Object Type:	
//		Print<Integer> pep = new Print<>();		
//		pep.setValue(10);
//		pep.getValue();
		
//		//Pair Type Generic Class :
//		PrintPair<String, Integer> pair = new PrintPair<>();
//		pair.setPair("Saurabh",46);
//		pair.getPair();
//		
//		// Generic class with list type 
//		Print<String> strPrint = new Print<>();  // General way to create object 
//		Print rewObjectPrint = new Print<>();    // Raw type object for single use you can use this way as well
//		List<String> pp = List.of("abc","bbc","sdd","ddd","deew","dddk");
//		List<Integer> intList= List.of(1,2,3,4,4,5,6,7,8,9,10);
//		strPrint.setValue(pp);
//		rewObjectPrint.setValue(pp);
//		rewObjectPrint.setValue(intList);
//		
//		
//		
//		//Staic Generic Method call:
//		System.out.println("Value = "+Main.staticSolve(456738));
//		
//		//To call non static need a object of this class :
//		Main objMain =new Main();
//		System.out.println("value = "+objMain.nonStaticSolve(654890.990f));
		
		
		// Bounded Generic Class of Number ::
//		BoundedGeneric<Integer> objBoundedGeneric = new BoundedGeneric<>();
//		List<Integer> intList= List.of(1,2,3,4,4,5,6,7,8,9,10);
//		int res = objBoundedGeneric.sum(intList);
//		System.out.print(res);
		
		// Bounded Generic class of String :
		BoundedGeneric<String> objBoundedGeneric = new BoundedGeneric<>();
		List<String> intList= List.of("dgdhj","dhdh","ghrtyye","yyryyf");
		System.out.println(objBoundedGeneric.sum(intList));
		
		
		
	}
	
	
	//Generic Method  Static Method::
	public static <T> T staticSolve(T val) {
		System.out.println("T type : "+val.getClass());
		System.out.println("T type value :"+ val);
		return val;
	} 
	public <T> T nonStaticSolve(T val) {
		System.out.println("T type : "+val.getClass());
		System.out.println("T type value :"+ val);
		return val;
	}
	
	
	//wildcard method:
}
