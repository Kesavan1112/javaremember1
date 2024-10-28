package busresv;
import java.util.Scanner;
import java.util.ArrayList;
// import java.util.;;
public class Busdemo {

 
    public static void main(String[] args) 
    {
    ArrayList<angryvechile>busy=new ArrayList<angryvechile>();
      busy.add(new angryvechile(1,true,20));
      int useroption=1;

      Scanner sc=new Scanner(System.in);
      //Buses.add(b1);
/*for(Bus bu:Buses){
      bu.display();
    }*/
      
        while(useroption==1)
        {
            System.out.println("enter 1 which you can book or 2 which can cancel.");
          useroption=sc.nextInt();
if(useroption==1){
            System.out.println("keep continuing the booking");
            sc.nextInt();
}
else{
    System.out.println("thank you");
    break;

}
sc.close();        
}
        /*switch (a) {
            case 77:
            System.out.println("booking");
                
                break;
        
            default:
            System.out.println(" not booking");

            //break;
        }*/
    }
}

