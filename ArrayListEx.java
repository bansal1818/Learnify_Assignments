import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        int i;
        ArrayList al=new ArrayList();
        for(i=1;i<10;i++)
        {
            al.add(i);

        }
        //System.out.println(al);
        for(i=0;i<9;i++)
        {
            System.out.println("hii"+al.get(i));

        }
        for(Object o:al)
        {
            System.out.println("for each"+o); 
        }
        for(Object o:al)
        {   //if (o%2!=0)//not work we convert into integer
            Integer y=(Integer) o; 
            if (y%2!=0)
            {
              System.out.println("odd"+y); 
            }
        }

    }
    
}