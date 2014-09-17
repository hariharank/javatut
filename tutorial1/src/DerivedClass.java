class BaseClass{
    protected int prot;
    static int counter;
    public int pub;
    private int priv;
    
    BaseClass(){
        counter++;
    }
    private int privMethod(int priv){
        this.priv=priv;
        return this.priv;
    }
    
    public int pubMethod(int pub){
        this.pub=pub;
        return this.pub;
                
    }
    protected int protMethod(int prot){
        this.prot=prot;
        return prot;
    }
    
    public int getCount(){
        return counter;
    }
}

public class DerivedClass extends BaseClass{
    
    DerivedClass(){
     
    }
    public int pubMethod(int pub){
        //this.pub=pub;  
        this.pub=10+20;
        return this.pub;
    }
    
    public static void main(String[] args){
      DerivedClass dc=new DerivedClass();
      int x=dc.getCount();
      DerivedClass dc1=new DerivedClass();
      int y=dc1.getCount();
      //System.out.println(dc.pubMethod(10));
      System.out.println(x);
      System.out.println(y);
      
      BaseClass bc=new DerivedClass();
      System.out.println(bc.pubMethod(10));
      
      bc=new BaseClass();
      System.out.println(bc.pubMethod(10));
      
    }
}