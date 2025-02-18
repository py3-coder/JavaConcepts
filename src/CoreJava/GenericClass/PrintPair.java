package CoreJava.GenericClass;

//Pair Type : Generic
public class PrintPair<K , T>{
	K key;
	T val;
	
	public void setPair(K key, T value) {
		System.out.println("K type: "+key.getClass()+" T type: "+value.getClass());
		this.key = key;
		this.val = value;
	}
	
	public void getPair() {
		System.out.println("Key "+key+" - value "+val);
	}
}
