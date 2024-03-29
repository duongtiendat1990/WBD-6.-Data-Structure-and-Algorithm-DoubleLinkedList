
public class MyLinkedList {
  private Node head;
  private Node tail;
  private int numNodes;

  public MyLinkedList(Object data) {
    head = new Node(data);
    tail = head;
  }

  public MyLinkedList (Object ...array){
    head = new Node(array[0]);
    tail = new Node(array[array.length-1]);
    Node current = head;
    for (int i = 1; i<array.length-1;i++){
      current.next = new Node(array[i]);
      Node temp = current;
      current = current.next;
      current.previous = temp;
    }
    current.next = tail;
    tail.previous = current;
  }
  protected class Node {
    private Node next;
    private Node previous;
    private Object data;

    public Node(Object data) {
      this.data = data;
      numNodes++;
    }

    public Object getData() {
      return this.data;
    }
  }

  public void add(int index, Object data) {
    if (index <= numNodes  && index >= 0) {
      if (index == 0) addFirst(data);
      else if (index == numNodes ) addLast(data);
      else if (index<numNodes/2){
        Node current = head;
        Node temp;

        for (int i = 1; i < index ; i++) {
          current = current.next;
        }

        temp = current.next;
        current.next = new Node(data);
        current.next.previous = current;
        current.next.next = temp;
        temp.previous = current.next;
      }
      else {
        Node current = tail;
        Node temp;

        for (int i = numNodes-1; i >index ; i--) {
          current = current.previous;
        }
        temp = current.previous;
        current.previous = new Node(data);
        current.previous.next = current;
        current.previous.previous = temp;
        temp.next = current.previous;
      }
    }
  }
  public void remove(int index) {
    if (index <= numNodes  && index >= 0) {
      if (index == 0) removeFirst();
      else if (index == numNodes-1 ) removeLast();
      else if (index<numNodes/2){
        Node current = head;
        Node temp;

        for (int i = 1; i < index ; i++) {
          current = current.next;
        }

        temp = current.next.next;
        current.next = temp;
        temp.previous = current;
        numNodes--;
      }
      else {
        Node current = tail;
        Node temp;

        for (int i = numNodes-2; i > index ; i--) {
          current = current.previous;
        }
        temp = current.previous.previous;
        current.previous = temp;
        temp.next = current;
        numNodes--;
      }
    }
  }

  public void addAll(int index, Object ...array){
    if (index <= numNodes  && index >= 0) {
      MyLinkedList tempList = new MyLinkedList(array);
      if (index == 0) addAllFirst(array);
      else if (index == numNodes ) addAllLast(array);
      else if (index<numNodes/2){
        Node current = head;
        Node temp;

        for (int i = 1; i < index ; i++) {
          current = current.next;
        }
        temp = current.next;
        current.next = tempList.head;
        tempList.head.previous = current;
        tempList.tail.next = temp;
        temp.previous = tempList.tail;
        numNodes+=array.length;
      }
      else {
        Node current = tail;
        Node temp;

        for (int i = numNodes-1; i >index ; i--) {
          current = current.previous;
        }
        temp = current.previous;
        current.previous = tempList.tail;
        tempList.tail.next = current;
        tempList.head.previous = temp;
        temp.next = tempList.head;
        numNodes+=array.length;
      }
    }
  }

  public void addAllFirst(Object ...array){
    MyLinkedList temp = new MyLinkedList(array);
    Node tempNode = head;
    head = temp.head;
    temp.tail.next = tempNode;
    tempNode.previous = temp.tail;
    numNodes+=array.length;
  }

  public void addAllLast(Object ...array){
    MyLinkedList temp = new MyLinkedList(array);
    Node tempNode = tail;
    tail = temp.tail;
    temp.head.previous = tempNode;
    tempNode.next = temp.head;
    numNodes+=array.length;
  }
  public void addFirst(Object data) {
    if (this.size()==0){
      head = new Node(data);
      tail = head;
    }
    Node temp = head;
    head = new Node(data);
    temp.previous = head;
    head.next = temp;
  }

  public void addLast(Object data) {
    if (this.size()==0){
      head = new Node(data);
      tail = head;
    }
    tail.next = new Node(data);
    tail.next.previous = tail;
    tail = tail.next;
  }

  public void removeFirst() {
    head = head.next;
    head.previous = null;
    numNodes--;
  }

  public void removeLast() {
    tail = tail.previous;
    tail.next = null;
    numNodes--;
  }

  public Object get(int index) {
    Node temp;
    if (index>=0&&index<numNodes){
      if (index<numNodes/2){
        temp = head;
        for (int i = 0; i < index; i++) {
          temp = temp.next;
        }
      } else {
        temp = tail;
        for (int i = numNodes-1; i >index ; i--) {
          temp = temp.previous;
        }
      }
      return temp.getData();
    }
    return null;
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
  public int size(){
    return numNodes;
  }
}
