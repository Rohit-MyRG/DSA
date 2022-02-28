import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {

        Collection arr = new ArrayList();
        arr.add(10);
        arr.add(20);

        Iterator itr = arr.iterator();

        System.out.println(itr.next());
        System.out.println(itr.next());


    }
}


//   collection  -- concept, 
//   Collection  --  interface
//   Collections --  class