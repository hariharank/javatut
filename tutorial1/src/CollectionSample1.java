import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class CollectionSample1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
    List<String> l1=new ArrayList<String>();
    String a="Hari";
    l1.add("Hello");
    l1.add("Hari");
    l1.add("hariharan");
    l1.add(a);
    //l1.add(34);
    //l1.remove(3);
    int size=l1.size();
    
    //Iterator it=l1.iterator();
  //  while(it.hasNext()){
        //String element= (String) it.next();
      //  System.out.println(it.next());
        
    //}
    for(Object o:l1){
        System.out.println(o);
    }
    System.out.println(size);
    System.out.println(l1.get(3));
    
    }

}
