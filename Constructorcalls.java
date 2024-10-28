class Person {
    String name;
    int age;
    int b;

    // Constructor with no parameters
    Person() {
        this("kesavan", 20);  // Calling another constructor
    System.out.println("no argument with constructor");
    
    }
    Person(int b){
    

        System.out.println("single parameter construtor="+b*b);
    }

    // Constructor with two parameters
    Person(String n, int a) {
    this(4);
        name = n;
        age = a;

        System.out.println("name="+name+"and age is"+age);
        System.out.println(" argument with constructor");

    }
}
class Constructorcalls{
    public static void main(String args[])
    {
        Person k=new Person();
    }
}
/*The **first parameterized constructor** is executed because of **constructor chaining** using the `this()` keyword. When you call a constructor using `this()`, the constructor with the matching signature is executed first, and only after it finishes, the control returns to the calling constructor.

Here’s a breakdown of why the parameterized constructor is executed first in your code:

### Step-by-Step Explanation:

1. **Object Creation (`Person k = new Person();`)**:
   - When you write `Person k = new Person();`, the no-argument constructor (`Person()`) is called because no parameters are passed.

2. **Constructor Chaining (`this("Unknown", 0);`)**:
   - Inside the no-argument constructor, there is a call to `this("Unknown", 0);`. This statement **explicitly** calls the **parameterized constructor** `Person(String n, int a)` with the values `"Unknown"` and `0`.
   - The `this()` call must be the **first statement** in the constructor, and because of this, **the parameterized constructor gets executed first** before any further code in the no-argument constructor is executed.

3. **Execution of Parameterized Constructor (`Person(String n, int a)`)**:
   - The parameterized constructor initializes the `name` and `age` fields with `"Unknown"` and `0`, respectively.
   - Any code within the parameterized constructor, such as `System.out.println()`, is executed at this point.
   
4. **Return to No-argument Constructor**:
   - Once the parameterized constructor has completed its execution, control returns to the no-argument constructor (`Person()`), and the remaining code in the no-argument constructor is executed (in this case, a print statement saying `"No-argument constructor called."`).

### Key Concept: **Constructor Chaining**

- **`this()`**: This keyword is used to call another constructor in the **same class**. It allows you to pass control to another constructor and reuse code to initialize common fields.
- **Constructor Execution Order**: If a constructor calls another constructor using `this()`, the called constructor is executed first, and only after it finishes, control returns to the calling constructor.

### Code Recap:

```java
class Person {
    String name;
    int age;

    // Constructor with no parameters
    Person() {
        this("Unknown", 0);  // Calls the parameterized constructor first
        System.out.println("No-argument constructor called.");
    }

    // Constructor with two parameters
    Person(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called.");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Constructorcalls {
    public static void main(String args[]) {
        Person k = new Person();  // Calls the no-argument constructor
    }
}
```

### Output:

```plaintext
Parameterized constructor called.
Name: Unknown, Age: 0
No-argument constructor called.
```

### Why Does the Parameterized Constructor Execute First?
- The no-argument constructor calls the parameterized constructor with `this("Unknown", 0);`.
- Since `this()` is the first statement in the no-argument constructor, the parameterized constructor is executed **before** the rest of the no-argument constructor's code.
- Once the parameterized constructor completes, the execution resumes in the no-argument constructor, which then prints `"No-argument constructor called."`.

### Summary:
- The parameterized constructor is executed first because it is called from the no-argument constructor using `this()`.
- Constructor chaining (`this()`) ensures that the called constructor runs first, initializing the object properly before returning control to the original constructor.


No, you **cannot include multiple `this()` calls** in the same constructor in Java. The reason is that the `this()` call to another constructor **must be the first statement** in a constructor, and **only one `this()` call is allowed**. Once you call `this()`, control is passed to the other constructor, and no further `this()` calls are allowed after that.

In your example:

```java
Person() {
    this("kesavan", 20);  // Valid call to another constructor
    this(3);  // This is not allowed (second this() call)
    System.out.println("no argument with constructor");
}
```

The second `this(3);` call will result in a **compilation error**, because you can only call one constructor using `this()` at the beginning of the constructor.

### How to Work Around This?

If you want to call different constructors with varying parameters, you can chain them in a sequence. For example, you can let one constructor call another, and that one can further call another constructor.

### Solution: Constructor Chaining

Here’s an example of how you can achieve this using constructor chaining:

```java
class Person {
    String name;
    int age;

    // Constructor with no parameters
    Person() {
        this("kesavan", 20);  // Calling the parameterized constructor
        System.out.println("No-argument constructor called");
    }

    // Constructor with two parameters
    Person(String n, int a) {
        this(3);  // Now calling the constructor with int parameter
        name = n;
        age = a;
        System.out.println("Parameterized constructor with name and age called");
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Constructor with one int parameter
    Person(int b) {
        System.out.println("Constructor with int parameter called");
        System.out.println(b * b);
    }
}

public class Constructorcalls {
    public static void main(String[] args) {
        // Creating a new Person object using the no-argument constructor
        Person k = new Person();
    }
}
```

### Output:

```plaintext
Constructor with int parameter called
9
Parameterized constructor with name and age called
Name: kesavan, Age: 20
No-argument constructor called
```

### Explanation:
- **No-argument constructor (`Person()`)**: It first calls the constructor with two parameters (`Person(String n, int a)`) using `this("kesavan", 20);`.
- **Parameterized constructor (`Person(String n, int a)`)**: This constructor then calls the constructor with one int parameter (`Person(int b)`) using `this(3);`.
- **`Person(int b)`**: This constructor calculates and prints `3 * 3`, then control returns to the `Person(String n, int a)` constructor.
- Finally, control goes back to the no-argument constructor, and it prints `"No-argument constructor called"`.

### Summary:
- **Only one `this()` call** is allowed per constructor, and it must be the **first statement** in the constructor.
- To work around this, you can use **constructor chaining**, where one constructor calls another, and that one calls another if needed.





*/