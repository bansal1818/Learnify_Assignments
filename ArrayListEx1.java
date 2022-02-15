import java.util.ArrayList;

public class Arrayl
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add("hii");
        al.add(new Integer(14));
        al.add("07");
        al.add("here");
        al.add(true);
        al.add(null);
       
        System.out.println(al);
        ArrayList al1= new ArrayList();
	
	al1.add("yajat");
	al1.add("kushi");
	al1.add("govindh");
	
	
	al.addAll(al1);
	System.out.println(al);
	
	al.retainAll(al1);
	System.out.println(al);

        
    }

}