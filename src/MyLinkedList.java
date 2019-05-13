
public class MyLinkedList {
  private Node head;
  private Node tail;
  private int numNodes;

  public MyLinkedList(Object data) {
    head = new Node(data);
    tail = head;
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
    if (index <= numNodes - 1 && index >= 0) {
      if (index == 0) addFirst(data);
      else if (index == numNodes - 1) addLast(data);
      else {
        Node temp = head;
        Node holder;

        for (int i = 1; i < index - 1 && temp.next != tail; i++) {
          temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
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
