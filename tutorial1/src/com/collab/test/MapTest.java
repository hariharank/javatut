package com.collab.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
         Map<String, String> m1=new HashMap<String, String>();
         m1.put( "H", "Hariharan");
         m1.put("","SIVA");
         m1.put("S", "Selva");
         m1.put("B", "Balaji");
         System.out.println(m1);
         System.out.println(m1.get("H"));
         System.out.println(m1.hashCode());
         System.out.println(m1.isEmpty());
         m1.put("R", "RAM");
         System.out.println(m1);
         m1.clear();
         
         Map<Integer,String> m2=new HashMap<Integer,String>();
         m2.put(1, "Tamil");
         m2.put(2,"English");
         m2.put(3, "Hindi");
         m2.put(1,"tamil");
         System.out.println(m2);
                 
    }

}
