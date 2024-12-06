class Person {
    // Private fields (data hidden from outside)
    private String name;
    private int age;

    // Public methods to access and modify private data
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // Validation to ensure age is positive
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John"); // Set name using a setter
        person.setAge(25);      // Set age using a setter
        System.out.println("Name: " + person.getName()); // Get name using a getter
        System.out.println("Age: " + person.getAge());   // Get age using a getter
    }
}
