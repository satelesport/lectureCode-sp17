/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Creates an empty list. */
    private int size;
    private int[] list=new int[2000005];
    public AList() {
        size=0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        list[size]=x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return list[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return list[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        int x=list[size-1];
        size--;
        return x;
    }
} 