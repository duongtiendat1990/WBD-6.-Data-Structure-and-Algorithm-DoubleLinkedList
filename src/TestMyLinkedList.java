public class TestMyLinkedList {
  public static void main(String[] args) {
    System.out.println("/=/=/=/= TESTING /=/=/=/=");
    MyLinkedList ll = new MyLinkedList(9);
    ll.addFirst(11);
//    ll.addFirst(12);
//    ll.addFirst(13);
//
//    ll.add(4,9);
//    ll.addLast(100);
    ll.add(-1,8);
    ll.addLast(110);
    ll.printList();
  }
}