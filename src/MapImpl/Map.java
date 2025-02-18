package MapImpl;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Map<K , V> {
	K keyK;
	V valV;
	private int currSize=0;
	private int size=16;
	static float loadfactor = 0.75f;
	List<Node<K, V>> list = new ArrayList<>();
	
	
	public Map() {
        for (int i = 0; i < size; i++) {
            list.add(null);
        }
    }
	public Map(int currCap) {
		size = currCap;
        for (int i = 0; i < size; i++) {
            list.add(null);
        }
    }

	public void put(K key,V val) {
		System.out.println("Map CurrSize"+currSize);
		if(currSize>=0.75f*size) {
			//capacity double
			//rehashing 
			rehashing();
		}
		int hashVal =hash(key);
		int indx = hashVal%size;
		Node<K,V> headNode = this.list.get(indx);
		currSize++;
		if(headNode==null) {
			Node<K, V> currNode = new Node<K, V>(key,val,hashVal,null);
			list.set(indx, currNode);
		}else {
			Node<K, V> currNode = new Node<K, V>(key,val,hashVal,headNode);
			list.set(indx, currNode);
		}
	    return ;
	}
	
	public V get(K key) {
		int hashVal =hash(key);
		int indx = hashVal%size;
		Node<K,V> headNode = list.get(indx);
		while (headNode != null) { 
	        if (headNode.key.equals(key) && headNode.hash == hashVal) {
	            return headNode.val;
	        }
	        headNode = headNode.nextNode; 
		  }
		return null; 
	}
	public int getSize() {
		return currSize;
	}
	private int hash(K key) {
		return Math.abs(key.hashCode());
	}
	private void rehashing() { 
		// do something :
		System.out.println("Rehasing is Started prev size:"+size);
		size = size*2; // size double
		System.out.println("new size of map :"+size);
		List<Node<K, V>> oldList = list;
	    list = new ArrayList<>(size);
	    for (int i = 0; i < size; i++) {
	        list.add(null);
	    }
	    currSize = 0;
		for(Node<K, V> currNode : list) {
			while(currNode!=null) {
				put(currNode.key, currNode.val);
				currNode = currNode.nextNode;
			}	
		}
		//list = newMap.list;
			
	}
}
