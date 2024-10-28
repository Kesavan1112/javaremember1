class Parent {
    int age;

    // Constructor of Parent class
    Parent(int a) {
        age = a;
        System.out.println("Parent constructor called");
    }

    void displayAge() {
        System.out.println("Age: " + age);
    }
}

class Child extends Parent {
    String name;

    // Constructor of Child class
    Child(String n) {
        super(50); // Pass a default or specific value for age to Parent class constructor
        name = n;
        System.out.println("Child constructor called");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        displayAge(); // Access the method from Parent class to display age
    }
}

public class InheritanceWithConstructor {
    public static void main(String[] args) {
        // Creating an object of Child class
        Child c = new Child("John");
        c.displayDetails();
    }
}
