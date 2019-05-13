public class TestMyLinkedList {
  public static void main(String[] args) {
    System.out.println("/=/=/=/= TESTING /=/=/=/=");
    MyLinkedList ll = new MyLinkedList(1,2,3,1,5,1,6,12);
    ll.addFirst(11);
    ll.addFirst(12);
    ll.addFirst(13);

    ll.add(3,8);
    ll.addLast(100);
    ll.add(2,8);
    ll.addLast(110);
    ll.printList();
    System.out.println("Head" + ll.head.getData());
    System.out.println("Tail" + ll.tail.getData());
  }
}