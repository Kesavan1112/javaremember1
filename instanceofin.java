
//(object) instanceof (type)

class Animal {}
class Dog extends Animal {}
class cow{}

public class instanceofin{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal d=new Animal();
       cow e=new cow();
        System.out.println(dog instanceof Dog); // true
        System.out.println(dog instanceof Animal); // true
        System.out.println(dog instanceof Object); // true
    System.out.println(d instanceof Dog);//false this would be true,when Animal d=new Dog();
    System.out.println(d instanceof Animal);//true 
System.out.println(e instanceof cow);



}
}