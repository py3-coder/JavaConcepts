package CoreJava.GenericClass;

import java.util.List;

// Single Generic
//public class Print<T> {
//	T val;
//	
//	public void setValue(T value) {
//		System.out.println("Setting Value in Generic Class");
//		this.val = value;
//	}
//	
//	public T getValue() {
//		return val;
//	}
//
//}




// If i want list of t object::
public class Print<T> {
	List<T> val;
	
	public void setValue(List<T> value) {
		System.out.println(value);
	}
	
}