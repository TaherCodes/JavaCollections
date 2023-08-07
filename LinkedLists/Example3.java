import java.util.*;
import java.util.LinkedList;
import java.util.ArrayList;
public class Example3 {
   public static void main(String[] args){
    LinkedList<String> list = new LinkedList<String>();
    list.add("abc");
    list.add("xyz");
    list.add("mno");

    Collection<String> collect = new ArrayList<String>();
    collect.add("ABC");
    collect.add("XYZ");
    collect.add("MNO");
   System.out.println("###################");

    Collection<String> collect1 = new ArrayList<String>();
    collect1.add("XXX");
    collect1.add("XXX");
    collect1.add("XXX");   

    System.out.println("The Linked List is:" + list);
    list.addAll(1, collect1);
    list.addAll(collect);
    System.out.println("The new linked list is: " + list );
    System.out.println("Helloo People");
    
   } 
}
