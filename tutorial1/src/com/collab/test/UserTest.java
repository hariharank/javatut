package com.collab.test;
import java.util.ArrayList;
import java.util.List;

public class UserTest{
public static void main(String[] args) {
    // TODO Auto-generated method stub
    User obj1=new User();
    User obj2=new User();
    
    Address a1=new Address();
    a1.setaddress("Tiruppur", "TUP");
    
    Address a2=new Address();
    a2.setaddress("Guindy", "Chennai");
    
    Company c1=new Company();
    c1.setCompanyName("CSPL");
    c1.setCompanyAddress(a2);
    
    Address a3=new Address();
    a3.setaddress("Tambaram","Chennai");
    //sa3.setStreet2("Chennai");
    
    /*Address a4=new Address();
    a4.setStreet1("Gunidy");
    a4.setStreet2("Chennai");*/
    
    Company c2=new Company();
    c2.setCompanyName("CollabNet");
    c2.setCompanyAddress(a2);
    
    
    obj1.setFname("Hariharan");
    obj1.setLname("K");
    obj1.setmyAddress(a1);
    obj1.setmyCompany(c1);
    
    obj2.setFname("Balaji");
    obj2.setLname("K");
    obj2.setmyAddress(a3);
    obj2.setmyCompany(c2);
    
    
    //System.out.println(obj1);
    //System.out.println(obj2);
    
    
    List<User> userList=new ArrayList<User>(); 
    userList.add(obj1);
    userList.add(obj2);
       
    System.out.println("*** Normal FOR loop ***"); 
    for(int i=0;i<userList.size();i++)
    {
      System.out.println(userList.get(i));
      
    }
    
    System.out.println("*** Enhanced FOR loop ***");
    for( User userObj:userList){
       System.out.println(userObj);
    }
    
 }
}