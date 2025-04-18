package week5;
// En üst sınıf (en parent)
class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

// Orta seviye sınıf (Animal'dan miras alıyor)
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals walk on land.");
    }
}

// En alt sınıf (Mammal'dan miras alıyor)
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks loudly.");
    }
}

// Test sınıfı
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Tüm atalarından gelen metodlara erişebilir
        myDog.eat();   // Animal'dan
        myDog.walk();  // Mammal'dan
        myDog.bark();  // Dog'dan
    }
}
