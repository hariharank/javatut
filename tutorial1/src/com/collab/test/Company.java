package com.collab.test;

public class Company {
    private String companyName;
    private Address companyAddress;
    
   /* Company(String companyName,String companyAddress){
        this.companyName=companyName;
        this.companyAddress=companyAddress;
    }*/
    
    public String getCompanyName() {
        return companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public Address getCompanyAddress() {
        return companyAddress;
    }
    
    public void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }
    
    

}
