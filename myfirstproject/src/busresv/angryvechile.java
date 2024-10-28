package busresv;
public class angryvechile 
{
    public int busno,capacity;
    public boolean AC;
   public angryvechile(int busno,boolean ac,int cap)
    {
      
      this.busno=busno;
      this.AC=ac;
      this.capacity=cap;

    }
    public int getcapcity()//accessor method
    {
      return capacity;
    }
    public void setcapcity(int cap)//mutator
    {
capacity=cap;

    }
    void display(){
      System.out.println("BUS NO:"+busno+"AC:"+AC+"CAPACITY OF BUS:"+capacity);

    }

    public static void main(String[] args) {
// bus b1=new bus(2,true,20);      
      //System.out.println("okay");  
    }
}
