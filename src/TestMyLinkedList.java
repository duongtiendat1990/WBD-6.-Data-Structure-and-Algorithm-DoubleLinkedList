
public class TestMyLinkedList {
  public static void main(String[] args) {
    System.out.println("/=/=/=/= TESTING /=/=/=/=");
    Integer[] array = new Integer[]{2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
    MyLinkedList ll = new MyLinkedList(array);
    ll.add(0,1);
    ll.add(19,20);
    ll.printList();
    ll.remove(1);
    ll.remove(17);
    ll.printList();
  }
}