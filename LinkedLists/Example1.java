import java.util.*;
public class Example1{
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        list.addLast("z");
        list.addFirst("1");
        list.add(2, "two");
        list.remove("b");
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}