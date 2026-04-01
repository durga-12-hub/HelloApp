

public class HelloApp {
    public static void main(String[] args) {
        // args[0] picks up the first argument provided in the terminal
        String name = args[0];
        
        // Using the + operator to combine (concatenate) the greeting and the name
        System.out.println("Hello, " + name + "!");
    }
}