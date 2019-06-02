
public class TestMyLinkedList {
  public static void main(String[] args) {
    System.out.println("/=/=/=/= TESTING /=/=/=/=");
    MyLinkedList ll = new MyLinkedList(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19);
    ll.add(0,1);
    ll.add(19,20);
    ll.printList();
    System.out.println("Head" + ll.head.getData());
    System.out.println("Tail" + ll.tail.getData());
    System.out.println(ll.size());
  }
}