package com.collab.test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set<String> setObj=new HashSet<String>();
               
        setObj.add("Hari");
        setObj.add("Hariharan");
        setObj.add("Sudharsan");
        setObj.add("Balaji");
        setObj.add("Hari");
        
        for(String s:setObj){
            System.out.println(s);
        }
        
    }

}
