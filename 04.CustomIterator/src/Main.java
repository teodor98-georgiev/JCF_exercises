import java.util.Iterator;
// Extend MyList interface (that was implemented during the previous hometask - https://docs.google.com/document/d/1g5GRLOU4XRDCIp50n_-Dmnok-2EdoDTlAQdVm6XyBLo/edit?usp=sharing - task #3 ) with Iterable interface like this:
//
//interface MyList extends Iterable<Object>
//
//
//In class DefaultMyList implements iterator() method
//
//public Iterator<Object> iterator() {
//
//return new IteratorImpl();
//
//}
//
//
//
//Implement inner class that would implement Iterator interface
//
//private class IteratorImpl implements Iterator<Object> {
//
//public boolean hasNext() {
//// returns true if the iteration has more elements
//
//// …
//
//}
//
//
//
//public Object next() {
//// returns the next element in the iteration
//
//// …
//
//}
//
//
//
//public void remove() {
//// removes from the underlying collection the last element returned by this iterator
//
//// …
//
//}
//
//}
//
//
//Remove method should throw IllegalStateException in case method remove was called without calling ‘next()’ method. Or in case it was called two times in a row.
//
//Tech note: to throw IllegalStateException wright the next code
//
//throw new IllegalStateException();
//
//
//
//In case there is no next element - NoSuchElementExcpetion should be thrown.
//
//Tech note: to throw NoSuchElementException wright the next code
//
//throw new NoSuchElementException();
//
//
//Iterator should work with Integers or String types
public class Main {
    public static void main(String[] args) {
        DefaultMyList list = new DefaultMyList();
        list.add("apple");
        list.add("banana");
        list.add("pinapple");

        list.remove("banana");
        list.size();
        list.add("lemon");
        list.add("strawberry");
        list.add("watermelon");
        list.add("melon");
        list.add("plum");
        list.add("grape");
        //Boolean result = list.contains("pinapple");
        //System.out.println(result);
//        DefaultMyList list2 = new DefaultMyList();
//        list2.add("cherry");
//        list2.add("vinegard");
//        list2.add("pinapple");
//        list2.add("lime");
//        Boolean result = list2.containsAll(list);
//        System.out.println(result);
//        System.out.println(list);
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.remove();

    }
}