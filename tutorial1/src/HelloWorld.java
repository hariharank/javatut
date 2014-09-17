public class HelloWorld{
    public static void main(String[] args){
        System.out.print("Hello,World!");
        method1();
    }
    
    public static void method1(){
        Test x=new Test();
        x.setT(new Test1());
        x.setString("test");
        System.out.println(x.getT().a + x.getString());
    }
    
}

class Test {
    private Test1 t = null;
    private String string= null;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Test1 getT() {
        return t;
    }

    public void setT(Test1 t) {
        this.t = t;
    }
}

class Test1{
    
    public String a = "hari";
}