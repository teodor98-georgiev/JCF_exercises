public class Main {
    public static void main (String[] args){
        DefaultMyList list = new DefaultMyList();
        list.add("apple");
        list.add("banana");
        list.add("pinapple");

        list.remove("banana");
        list.size();
        list.add("lemon");
        //Boolean result = list.contains("pinapple");
        //System.out.println(result);
        DefaultMyList list2 = new DefaultMyList();
        list2.add("cherry");
        list2.add("vinegard");
        list2.add("pinapple");
        list2.add("lime");
        Boolean result = list2.containsAll(list);
        System.out.println(result);
        System.out.println(list);
    }
}
