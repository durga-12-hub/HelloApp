
public class HelloApp {
    public static void main(String[] args) {
        // 1. Set a default name
        String name = "World";

        // 2. Check if the user provided an argument
        // .length tells us how many words you typed after the command
        if (args.length > 0) {
            name = args[0]; // Overwrite "World" with the input name
        }

        // 3. Output the greeting
        System.out.println("Hello, " + name + "!");
    }
}