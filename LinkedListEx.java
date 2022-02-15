
   
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args)
    {
        LinkedList li=new LinkedList();
        li.add("hii");
        li.add(new Integer(14));
        li.add("07");
        li.add("here");
        li.add(true);
        li.add(null);

        li.size();
        System.out.println("SIZE"+li.size());
        System.out.println("name"+li.contains("SHUBHAM"));

        System.out.println(" first   "+li.getFirst());
        System.out.println("last   "+li.getLast());
        System.out.println("remove  "+li.remove());
        System.out.println("size now"+li.size());
        System.out.println("remove by index   "+li.remove(0)); 
        System.out.println("SIZE now"+li.size());       
    }
    
}
