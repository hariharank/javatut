package com.collab.test;
class User{
    private String fname;
    private String lname;
    private Address myAddress; //=new Address("street1","street2");
    private Company myCompany; //=new Company("cspl","guindy");
    
    public Address getmyAddress() {
        return myAddress;
    }

    public void setmyAddress(Address myAddress) {
        this.myAddress = myAddress;
    }

    public Company getmyCompany() {
        return myCompany;
    }

    public void setmyCompany(Company myCompany) {
        this.myCompany = myCompany;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String toString(){
        return (fname+" "+lname+myAddress.getStreet1()+myAddress.getStreet2()+myCompany.getCompanyName()+myCompany.getCompanyAddress().getStreet1()+myCompany.getCompanyAddress().getStreet1());
    }

}