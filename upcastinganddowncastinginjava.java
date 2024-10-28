//this link mean rule of upcasting and downcasting.//https://www.blackbox.ai/share/8fc9c75d-5cab-40be-bd96-86a3be1f46a4

class A{
    void one(){
        System.out.println("one");
    }
}
class B extends A{
    void one(){
    System.out.println("two");
}
}



public class upcastinganddowncastinginjava {

public static void main(String args[])
{
A a1=new B();
a1.one();
B d=(B)a1;
 d.one();
B d1=new B();
d1.one();
A a2=new A();
a2.one();
B a3=(B)a2;
a3.one();


}

 //34   
}
//this link mean how to this code work here//https://www.blackbox.ai/share/a1782e72-f6e5-4683-b90c-dd86eca77496