class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    
}

class Employee {
    private String name;
    private int age;
    private int employeeId;

    public Employee(String name, int age, int employeeId) {
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if they are the same object
        if (obj == null) return false; // Check if obj is null

        // Allow comparison between Employee and Person
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return name.equals(person.getName()) && age == person.getAge();
        }

        if (getClass() != obj.getClass()) return false; // Check if they are the same class

        // Compare fields if it's an Employee object
        Employee employee = (Employee) obj;
        return name.equals(employee.getName()) && age == employee.getAge() && employeeId == employee.getEmployeeId();
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + employeeId;
    }
}

public class objectcompareprogram{
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        Employee employee = new Employee("John Doe", 30, 12345);

        // Comparing objects of different classes
        if (person.equals(employee)) {
            System.out.println("Person and Employee are considered equal.");
        } else {
            System.out.println("Person and Employee are NOT equal.");
        }

        // Comparing employee to person (reverse comparison)
        if (employee.equals(person)) {
            System.out.println("Employee and Person are considered equal.");
        } else {
            System.out.println("Employee and Person are NOT equal.");
        }

        // Comparing employee to employee
        Employee anotherEmployee = new Employee("John Doe", 30, 12345);
        if (employee.equals(anotherEmployee)) {
            System.out.println("Employee objects are considered equal.");
        } else {
            System.out.println("Employee objects are NOT equal.");
        }
    }
}
/*// Overriding equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if they are the same object
        if (obj == null) return false; // Check if obj is null

        // Allow comparison between Person and Employee
        if (obj instanceof Employee) {
            Employee employee = (Employee) obj;
            return name.equals(employee.getName()) && age == employee.getAge();
        }
        
        if (getClass() != obj.getClass()) return false; // Check if they are the same class

        // Compare fields if it's a Person object
        Person person = (Person) obj;
        return name.equals(person.getName()) && age == person.getAge();
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    } */