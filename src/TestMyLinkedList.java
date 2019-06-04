
public class TestMyLinkedList {
  public static void main(String[] args) {
    System.out.println("/=/=/=/= TESTING /=/=/=/=");
    Integer[] array = new Integer[]{2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
    MyLinkedList ll = new MyLinkedList(array);
    ll.add(0,1);
    ll.add(19,20);
    Object foo = new Object();
    ll.add(ll.size(),foo);
    ll.printList();


    ll.addAll(2,1,2,1,5,1,4,5,1,5,41,4,1,5,100);
    ll.printList();
  }
}