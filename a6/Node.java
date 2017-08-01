/* basic node class that stores a string as data */

public class Node{
  private String data;
  private Node   next;

  /* constructors */
  public Node(){ this(null,null); }
  public Node(String data){ this(data, null); }

  public Node(String data, Node next){
    this.data = data;
    this.next = next;
  }
  
  /* getters */
  public String get(){ return data; }
  public Node getNext(){ return next; }
  
  /* setters */
  public void set(String s){ data = s; }
  public void setNext(Node n){ next = n; }
  
}