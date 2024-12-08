// Define an interface
interface Animal {
    void makeSound(); // Abstract method
    void eat();       // Abstract method
}

// Implement the interface in a class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
    
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
}

// Implement the interface in another class
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
    
    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
}

// Main class to demonstrate interface usage
public class Interface {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism
        Animal myCat = new Cat();
        
        myDog.makeSound();
        myDog.eat();
        
        myCat.makeSound();
        myCat.eat();
    }
}
