package busresv;

import java.util.Scanner;

class customer{
String customername;
int customerid;
int bankbalance;
void getcustomerdetail(){
    Scanner s=new Scanner(System.in);
    System.out.println("customer name:");
    customername=s.nextLine();
}
}
public class banking {
    public static void main(String[] args) {
        customer f=new customer();
        f.getcustomerdetail();
    }
    
}
