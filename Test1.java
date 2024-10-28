
//from user target generate 
import java.util.Scanner;


class jmccontroller
{
Scanner s1=new Scanner(System.in);

void generatenumber()
{

    System.out.println("year:");
    int year=s1.nextInt();


    System.out.println("enter starting number:");
    int startnum=s1.nextInt();

    System.out.println("enter total number:");
int totnum=s1.nextInt();
System.out.println("enter add in string");
String d=s1.next();

for(int stnum=startnum;stnum<=totnum;stnum++)
{
    System.out.println(""+year+d+stnum);

}
}

}
class studentdeets extends jmccontroller{
     
     Scanner d1=new Scanner(System.in);
     String studename=d1.nextLine();
    void makename(){
 System.out.println(studename);
 int i=Integer.parseInt(studename);  
if(i>0){
    System.out.println();
}

}
}

public class Test1 
{
    public static void main(String args[])
{
    jmccontroller jmc=new jmccontroller();
    //jmc.generatenumber()
studentdeets l=new studentdeets();
l.makename();
}

}
