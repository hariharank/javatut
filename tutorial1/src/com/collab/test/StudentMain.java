package com.collab.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    Student stud=new Student();
    stud.setStudentName("Hariharan");
    stud.setAddress("Chennai");
    
    Set<Student> st=new HashSet<Student>();
    st.add(stud);
    
    Iterator<Student> itr=st.iterator();
    
    while(itr.hasNext()){
          
          Student st1= itr.next();
          System.out.println(st1.getStudentName()+" "+st1.getAddress());
    }
    
    
    //System.out.println(st);
    
    for(Student std:st){
        System.out.println(std.getStudentName()+" "+std.getAddress());    
        //System.out.println(std);
    }
           
    }

    private static char[] Student(Object next) {
        // TODO Auto-generated method stub
        return null;
    }

}
