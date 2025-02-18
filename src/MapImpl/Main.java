package MapImpl;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new Map<>(2);
		mp.put(2,"saurabh");
		mp.put(12, "shivangi");
		mp.put(3, "gupta");
		mp.put(4, "mom");
		System.out.println(mp.get(4));
		System.out.println(mp.getSize());
		
		//Map<Integer, Integer> mpp = new Map<>();

	}

}
