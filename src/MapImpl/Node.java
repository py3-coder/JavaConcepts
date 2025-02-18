package MapImpl;

public class Node<K,V> {
	K key;
	V val;
	int hash;
	Node<K, V> nextNode;
	
	public Node(K key,V value,int currHash,Node next){
		this.key = key;
		this.val= value;
		this.hash=currHash;
		this.nextNode=next;
	}
}
