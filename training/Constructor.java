// Class definition
class Student {
    // Fields (attributes)
    String name;
    int rollNumber;
    String course;

    // Constructor to initialize the fields
    Student(String name, int rollNumber, String course) {
        this.name = name; // Assign parameter value to the class attribute
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

// Main class
public class Constructor {
    public static void main(String[] args) {
        // Creating objects of the Student class using the constructor
        Student student1 = new Student("Alice", 101, "Computer Science");
        Student student2 = new Student("Bob", 102, "Mechanical Engineering");

        // Displaying information for each student
        System.out.println("Student 1 Details:");
        student1.displayInfo();

        System.out.println("\nStudent 2 Details:");
        student2.displayInfo();
    }
}
