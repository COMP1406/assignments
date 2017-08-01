public abstract class ALinkedList{
	public Node head;
	public Node tail;
	public int  size;

	/** removes and returns the sublist 
		* [x_start, x_start+1, ..., x_end-1] from the current list
		* 
		* @param start is the starting position of the list to remove. 
		* You can assume that 0 <= start <= length of list -1. 
		* @param end is position after the last element to be removed.
		* You can assume that start <= end <= length of list.
		*/
	public abstract ALinkedList extract(int start, int end);


	/* -----------------------------------------
	   provided code
		 ----------------------------------------- */
	
		/** returns the size of the list
		* 
		* @return the size of the list
		*/
	public final int size(){ return size; }
	
	


	
	public final String get(int position){
		// returns data of element at index position
		// returns null otherwise
		if( position < 0 || position > size -1 || head == null){
			return null;
		}
		int  count = 0;
		Node current = head;
		while(count < position){
			current = current.getNext();
			count += 1;
		}
		return current.get();
	}

	
	/** add a string to the back of the list
	 * 
	 * @param s is a string to add to the back of the list
	 * @return the current list
	 */
	public final ALinkedList add(String s){
		if( size == 0 ){
			head = tail = new Node(s, null);
		}else{
			Node tmp = new Node(s, null);
			tail.setNext(tmp);
			tail = tmp;
		}
		size += 1;
		return this;
	}

	public final ALinkedList add(int position, String d){
		// add a new node with data d at given position
		// return null if method fails
		if( position < 0 || position > size){
			return null;
		}
		if( position == 0){
			return addFront(d);
		}else if( position == size ){
			return add(d);
		}
		// find node at index position-1
		Node prev = head;
		int count = 0;
		while( count < position-1 ){
			count += 1;
			prev = prev.getNext();
		} // prev will point to node before 
		Node n = new Node(d, prev.getNext() );
		prev.setNext(n);
		size += 1;
		return this;
	}

	
	/* remove from the back */
	public final String remove(){
		if( tail == null || size == 0 ){ return null; }
		
		String s = tail.get();
		if( size == 1){
			head = tail = null;
		}else{
			Node tmp = head;
			for(int i=0; i<size-2; i+=1){
				tmp = tmp.getNext();
			} // at end of loop tmp.getNext() == tail is true
			
			tail = tmp;
			tail.setNext(null);
		}
		size -= 1;
		return s;
	}

	/* remove first string in list */
	public final String removeFront(){
		if(head == null || size == 0){return null;}
		
		String s = head.get();
		if(size == 1){
			head = tail = null;
		}else{
			Node tmp = head;
			head = tmp.getNext();
			tmp.setNext(null);
		}
		size -= 1;
		return s;
	}
	
	/* add string to front of list */
	public final ALinkedList addFront(String s){
		if(size == 0){
			head = tail = new Node(s, null);
		}else{
			head = new Node(s, head);
		}
		size += 1;
		return this;
	}
	
	/* string representation of list */
	@Override
	public final String toString(){
		String s = "[";
		Node tmp = head;
		for(int i=0; i<size-1; i++){
			s += tmp.get() + ", ";
			tmp = tmp.getNext();
		}
		if(size > 0){
			s += tmp.get();
		}
		s += "]";
		return s;
	}
}