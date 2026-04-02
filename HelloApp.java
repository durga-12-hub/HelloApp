public class HelloApp {
    public static void main(String[] args) {

        // Check if no arguments are passed
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Using StringBuilder to build output
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        // Enhanced for loop
        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }

        // Final Output
        System.out.println("Hello, " + nameBuilder.toString());
    }
}