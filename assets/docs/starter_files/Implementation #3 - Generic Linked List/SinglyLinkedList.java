public class SinglyLinkedList<E> {

    static class ListNode<E>{

        public E data;
        public ListNode<E> next;

        public ListNode(E data){
            this.data = data;
            this.next = null;
        }


    }

    private ListNode<E> head;
    private ListNode<E> tail;
    private int size;

    public SinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    /* Case 1: we have to add the thing to the head */
    public void addToFront(E data){
        return; // Remove once you begin to implement
    }

    /* Case 2: we have to add the thing to the tail */
    public void addToEnd(E data){
        return; // Remove once you begin to implement this method
    }

    public ListNode<E> getNodeAtPosition(int pos) throws IndexOutOfBoundsException{
        return new ListNode<>((E) new Object()); // Remove this line once you begin to implement this method
    }

    /* Create a function that adds new nodes to the singly linked list */
    public void addNodeAtPosition(int pos, E data) throws IndexOutOfBoundsException{
        return; // Remove once you begin to implement this method
    }


    /* Case 1: we have to remove the thing to the head */
    public void removeFromFront() throws IndexOutOfBoundsException{
        return; // Remove once you begin to implement this method
    }

    /* Case 2: we have to add the thing to the tail */
    public void removeFromEnd() throws IndexOutOfBoundsException{
        return; // Remove once you begin to implement this method
    }

    /* Create a function that removes specific nodes from the singly linked list */
    public void removeNodeAtPosition(int pos) throws IndexOutOfBoundsException{
        return; // Remove once you begin to implement this method
    }

    /**/
    public boolean isEmpty(){
       return size == 0;
    }

    /**/
    public int size(){
        return size;
    }

    /*
    Creates a function that prints the contents of a linked list
     */
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();

        ListNode<E> t = head;
        while(t != null){
            s.append(t.data.toString() + " --> ");
            t = t.next;
        }
        s.append("null");

        return s.toString();
    }

}
