public class A {
    static String name = "Chathura";
    static int age = 20;

    public static void main(String args[]) {
        System.out.println("Hello " + name + " you are " + age + " years old.");
        B b = new B();
        System.out.println(b.age);  
    }
}

class B {
    int age = 100;
}