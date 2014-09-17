package com.collab.test;
import java.util.ArrayList;
import java.util.List;

public class UserTest{
public static void main(String[] args) {
    // TODO Auto-generated method stub
    User obj1=new User();
    User obj2=new User();
    User obj3=new User();
    User obj4 = new User();
    
    Address a1=new Address();
    a1.setStreet1("xyz1");
    a1.setStreet2("abc");
    
    Address a2=new Address();
    a2.setStreet1("Gunidy");
    a2.setStreet2("Gunidy-ekka");
    
    Company c1=new Company();
    c1.setCompanyName("CSPL");
    c1.setCompanyAddress(a2);
    
    obj1.setFname("Hariharan");
    obj1.setLname("K");
    obj1.setmyAddress(a1);
    obj1.setmyCompany(c1);
    
    System.out.println(obj1);
    
    //obj1.setFname("Hariharan");
    //obj1.setLname("K");
    //obj1.setMyAddress();
    //obj1.setMyCompany("CSPL","Guindy");
    
    /*
 
    List<User> userList=new ArrayList<User>(); 
    userList.add(obj1);
    userList.add(obj2);
    //userList.add(obj3);
    //userList.add(obj4);
    
    System.out.println("*** Normal FOR loop ***"); 
    for(int i=0;i<userList.size();i++)
    {
      System.out.println(userList.get(i));
      
    }
    
    System.out.println("*** Enhanced FOR loop ***");
    for( User userObj:userList){
       System.out.println(userObj);
    }*/
    
 }
}