/* In Java, every application must have at least one class with a main method.
* Top-level classes in Java (here HelloWorldClass) can only be declared as public or package-private (default access,
*  where no access modifier is specified).I can declare my class like "class HelloWorldClass" without access modifier
*  means "public".
* The main method is a special method that is executed when the program is run.
* in Java, we must use the public static void main(String[] args) signature for the main method
*  as specified by the Java language specifications.
* public: It is an access modifier that makes the main method accessible from outside the class.
* static: It indicates that the main method is a class-level method, which means it can be called
*  without creating an instance of the class. This is important because it allows the Java Virtual
*  Machine (JVM) to call the main method without having to create an object of the class.
* void: This is the return type of the main method. It means that the main method does not return
*  any value. The main method is designed to execute the program and typically doesn't return any
*  specific value.
* String[] args: This is the parameter list for the main method. It allows you to pass command-line
*  arguments to your Java program. The args parameter is an array of strings that can be used to
*  access command-line arguments passed when running the program.*/
public class HelloWorldClass {
    public static void main(String[] args) {
        System.out.print("Hello World!");
    }
}