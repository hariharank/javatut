
public class BobTest {

    public static void main(String[] args){
        // TODO Auto-generated method stub
        Bob b=new Bob("GoBobGo",9);
        System.out.println(b);

    }

}

class Bob{
    int shoesize1;
    String myname1;
    Bob(String myname,int shoesize){
        this.shoesize1=shoesize;
        this.myname1=myname;
        }
    public String toString(){
        return("HI I'm"+myname1+".my shoe size is "+shoesize1);
    }
    }