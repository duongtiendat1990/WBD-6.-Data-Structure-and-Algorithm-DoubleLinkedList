
public class MyLinkedList {
  private Node head;
  private Node tail;
  private  int numNodes;
  public MyLinkedList(Object data) {
    head = new Node(data);
    tail = new Node(data);
    head.next = tail;
    tail.next = null;
    numNodes++;
  }

  private class Node {
    private Node next;
    private Object data;

    public Node(Object data) {
      this.data = data;
    }

    public Object getData() {
      return this.data;
    }
  }
  public void add(int index, Object data) {
    Node temp = head;
    Node holder;

    for(int i=0; i < index-1 && temp.next != null; i++) {
      temp = temp.next;
    }
    holder = temp.next;
    temp.next = new Node(data);
    temp.next.next = holder;
    numNodes++;
  }
  public void addFirst(Object data) {
    Node temp = head;
    head = new Node(data);
    head.next = temp;
    numNodes++;
  }
  public void addLast(Object data) {
    tail.next = new Node(data);
    numNodes++;
  }
  public Node get(int index){
    Node temp=head;
    for(int i=0; i<index; i++) {
      temp = temp.next;
    }
    return temp;
  }
  public void printList() {
    Node temp = head;
    while(temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}
