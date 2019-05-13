
public class MyLinkedList {
  protected Node head;
  protected Node tail;
  private int numNodes;

  public MyLinkedList(Object data) {
    head = new Node(data);
    tail = head;
    numNodes++;
  }

  public MyLinkedList (Object ...array){
    head = new Node(array[0]);
    tail = new Node(array[array.length-1]);
    Node current = head;
    for (int i = 1; i<array.length;i++){
      current.next = new Node(array[i]);
      current = current.next;
    }
  }
  protected class Node {
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
    if (index <= numNodes  && index >= 0) {
      if (index == 0) addFirst(data);
      else if (index == numNodes ) addLast(data);
      else {
        Node current = head;
        Node temp;

        for (int i = 1; i < index ; i++) {
          current = current.next;
        }
        temp = current.next;
        current.next = new Node(data);
        current.next.next = temp;
        numNodes++;
      }
    }
  }

  public void addFirst(Object data) {
    Node temp = head;
    head = new Node(data);
    head.next = temp;
    numNodes++;
  }

  public void addLast(Object data) {
    tail.next = new Node(data);
    tail = tail.next;
    numNodes++;
  }

  public Node get(int index) {
    Node temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }
    return temp;
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
}
