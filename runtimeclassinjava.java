import java.util.Scanner;

class animal {


}

class cat extends animal{

}



public class runtimeclassinjava {

    public static void main(String[] args) {
        String obj = new String("Hello");
        Scanner sc=new Scanner(System.in);
animal ani=new cat();       
cat c=(ani)cat;

System.out.println("Runtime class: " +obj.getClass().getSimpleName());  // Output: java.lang.String
System.out.println("for scanner:"+sc.getClass().getSimpleName());

    }
    
}
/*In Java, the **runtime class** of an object refers to the actual class type of the object when it is being executed. This is particularly useful in a language like Java, where we work with polymorphism and can refer to an object by the type of its superclass or an interface.

For example:

```java
Object obj = new String("Hello");
```

In this example:
- The **compile-time type** of `obj` is `Object`.
- However, the **runtime class** of `obj` is `String`, as the `String` class is used to create the object.

The runtime class of an object determines:
- Which methods can be called on the object.
- How the object behaves if we override methods in its superclass.

### Using `getClass()` to Get Runtime Class
To find the runtime class of an object, we can use the `getClass()` method:

```java
Object obj = new String("Hello");
System.out.println("Runtime class: " + obj.getClass().getName());  // Output: java.lang.String
```

Here, `obj.getClass()` returns a `Class<?>` object representing the runtime class of `obj`, which is `String`. So, the output will be `"java.lang.String"`, the fully qualified name of the `String` class.

### Why Runtime Class is Important
1. **Polymorphism**: When we use polymorphism, we might know an object only by its superclass or interface. The runtime class helps Java determine which overridden method to call.
2. **Reflection**: Java's reflection API lets you inspect or manipulate objects based on their runtime class, enabling dynamic programming techniques like loading classes at runtime.
3. **Debugging and Logging**: Knowing the runtime class is often useful in debugging or logging information about objects. 

### Example with Inheritance

Consider a case with inheritance:

```java
class Animal {}
class Dog extends Animal {}

Animal myPet = new Dog();
System.out.println("Runtime class: " + myPet.getClass().getName());  // Output: Dog
```

Here, `myPet` is declared as an `Animal` (compile-time type), but it actually holds a `Dog` object (runtime class). 


If you want to print only the class name without the `class` keyword prefix, you can use the `getName()` method on the `Class` object. This method directly returns the fully qualified class name as a `String`, without any prefix.

Here’s how to do it:

```java
System.out.println("Runtime class: " + obj.getClass().getName());
System.out.println("For scanner: " + sc.getClass().getName());
```

Output:
```
Runtime class: java.lang.String
For scanner: java.util.Scanner
```

Alternatively, if you want just the simple name (without the package), you can use the `getSimpleName()` method:

```java
System.out.println("Runtime class: " + obj.getClass().getSimpleName());
System.out.println("For scanner: " + sc.getClass().getSimpleName());
```

Output:
```
Runtime class: String
For scanner: Scanner
```

Both methods allow you to avoid the `class` keyword in the output.


*/