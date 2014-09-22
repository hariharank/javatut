package com.collab.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class MapMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Product prod=new Product();
        prod.setProductName("Nokia");
        
        Product prod1=new Product();
        prod1.setProductName("Sony");
        
        Map<String,Product> mapObj=new HashMap<String,Product>();
                     
        mapObj.put("P1", prod);
        mapObj.put("P2", prod1);
        System.out.println(mapObj.keySet());
        
        //For loop with entryset
        for(Map.Entry<String, Product> e1:mapObj.entrySet()){
            System.out.println(e1.getValue().getProductName());
        }
        
        //Iterator with entryset
        Iterator<Entry<String, Product>> i1=mapObj.entrySet().iterator();
        while(i1.hasNext()){
            System.out.println(i1.next().getValue().getProductName());
        }
        
        //For loop with keyset
        for (String key:mapObj.keySet())        
        {
            System.out.println(mapObj.get(key).getProductName());
        }
       
        //Iterator with keyset
        Iterator<String> it=mapObj.keySet().iterator();
        while(it.hasNext()){
            System.out.println(mapObj.get(it.next()).getProductName());
        }
        
        
        
    }
     
}

