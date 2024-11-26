package Dec302023;

interface A {
    default void methodA() {
        System.out.println("Method A from interface A");
    }
}
// Interface B
interface B {
    default void methodB() {
        System.out.println("Method B from interface B");
    }
}
// Class implementing both interfaces A and B
class MyClass implements A, B {
    public void myMethod() {
        System.out.println("My method in MyClass");
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass obj = new MyClass();
        // Calling methods from both interfaces
        obj.methodA();
        obj.methodB();
        // Calling method defined in MyClass
        obj.myMethod();
    }
}
