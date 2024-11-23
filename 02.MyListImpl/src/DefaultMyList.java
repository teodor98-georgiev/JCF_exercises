
public class DefaultMyList implements MyList {

    int size = 0;

    /**
     * Pointer to first node.
     */
    Node first;

    /**
     * Pointer to last node.
     */
    Node last;

    /**
     * Appends the specified element to the end of this list (optional
     * operation).
     *
     * @param e element to be appended to this list
     */
    public void add(Object e){
        Node l = last;
        Node newNode = new Node(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }
    /**
     * Removes all of the elements from this list.
     * The list will be empty after this call returns.
     */
    @Override
    public void clear(){
        for (Node x = first; x != null; ) {
            Node next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }
    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present.  If this list does not contain
     * the element, it is unchanged.
     *
     * @param o element to be removed from this list, if present
     * @return true if this list contained the specified element
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     */
    @Override
    public boolean remove (Object o){
        if (o == null) {
            for (Node x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }
    public Object unlink(Node x) {
        // assert x != null;
        Object element = x.item;
        Node next = x.next;
        Node prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }
    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence (from first to last element).
     *
     * This method acts as bridge between array-based and collection-based
     * APIs.
     *
     * @return an array containing all of the elements in this list in proper
     *         sequence
     */

    @Override
    public Object[] toArray (){
        Object[] result = new Object[size];
        int i = 0;
        for (Node x = first; x != null; x = x.next)
            result[i++] = x.item;
        return result;
    }

    @Override
    /**
     * Returns the number of elements in this list.  If this list contains
     * more than Integer.MAX_VALUE elements, returns
     * Integer.MAX_VALUE.
     *
     * @return the number of elements in this list
     */
    public int size(){
        int size = 0;
        for (Node x = first; x != null; x = x.next){
            size++;
        }
        if (size == Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else {
            return size;
        }
    }
    /**
     * Returns true if this list contains the specified element.
     * More formally, returns true if and only if this list contains
     * at least one element e such that.
     *
     * @param o element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     * @throws NullPointerException if the specified element is null and this
     *         list does not permit null elements
     */
    @Override
    public boolean contains (Object o){
        boolean isElementFound = false;
        if (o != null) {
            for (Node x = first; x != null; x = x.next) {
                if (o.equals(x.item))
                    isElementFound = true;
            }
        }
        else {
            throw new NullPointerException();
        }
        //return -1;
        return isElementFound;
    }


    /**
     * Returns true if this list contains all of the elements of the
     * specified collection.
     *
     * @param  c object that implements MyList to be checked for containment in this list
     * @return true if this list contains all of the elements of the
     *         specified collection
     * @throws NullPointerException if the specified collection contains one
     *         or more null elements and this list does not permit null
     *         elements
     */
    @Override
    public boolean containsAll(MyList c){
        // in this way is faster and easier to access each element instead of looping through every
        // node. If I would do with forNode loop this works with only list types, but as definition MyList could
        // implement other collection types like ArrayList, que, Deque ecc so transforming c object in array is
        // most verstatile way to check for every element.
        Object[] array = c.toArray();
        if (c.equals(null)){
            throw new NullPointerException();
        }

        for (int i = 0; i < array.length; i++) {
            if (!contains(array[i])) {
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString() {
        if (first == null) {
            return "{}";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('{');

        for (Node x = first; x != null; x = x.next) {
            sb.append('[')
                    .append(x.item);

            if (x.next == null) {
                break;
            }
            sb.append(']')
                    .append(',')
                    .append(' ');
        }

        return sb.append(']')
                .append('}')
                .toString();
    }
    public class Node {
        Object item;
        Node next;
        Node prev;

        Node(Node prev, Object element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
        @Override
        public String toString() {
            return item.toString();
        }
    }
}
