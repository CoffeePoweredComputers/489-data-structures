import java.util.Arrays;

public class SimpleArrayList<E> implements SimpleList<E>{

    private static final int INITIAL_SIZE = 3;
    private static final int INCREASE_SIZE = 15;
    private Object items[];
    private int size;

    SimpleArrayList() {
        this.items = new Object[INITIAL_SIZE];
    }

    private void ensureCapacity(int minSize) {
        if(items.length < minSize){
        	items = Arrays.copyOf(items, size + INCREASE_SIZE);
        }
    }
   
    public void add(E e) {
        return; //remove when you implement this method
    }
    
    public int indexOf(E e){
        return -1; //remove when you implement this method
    }
 
    public boolean remove(E e) {
        return false; //remove when you implement this method
    }
   
    public E get(int i) {
        return null; //remove when you implement this method
    }

    public boolean contains(E e) {
        return false; //remove when you implement this method
    }
    
    public boolean isEmpty() {
    	return false; //remove when you implement this method
    }
	
    @Override
    public String toString(){
    	return null;
    }


}
