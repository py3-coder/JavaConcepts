package CoreJava.GenericClass;

import java.util.List;

//public class BoundedGeneric<T extends Number> {
//	
//	public T sum(List<T> lis) {
//		System.out.println("Generic Type : "+lis);
//		return lis.get(0);
//	}
//}


public class BoundedGeneric<T extends String> {
	
	public T sum(List<T> lis) {
		System.out.println("Generic Type : "+lis);
		return lis.get(0);
	}
}
