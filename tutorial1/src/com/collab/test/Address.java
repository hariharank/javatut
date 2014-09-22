package com.collab.test;

public class Address {
    
    private String address;
        
    public void setaddress(String street1,String street2){
        
        StringBuilder sb=new StringBuilder();
        sb.append(street1).append(" ").append(street2);
        address=sb.toString();
        //this.street1=street1;
        //this.street2=street2;
    }
    public String getaddress(){
        return address;
    }
    
    /*
    public String getStreet1() {
        return street1;
    }
    
    public void setStreet1(String street1) {
        this.street1 = street1;
    }
    
    public String getStreet2() {
        return street2;
    }
    
    public void setStreet2(String street2) {
        this.street2 = street2;
    }*/

}
