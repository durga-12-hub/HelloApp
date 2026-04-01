

public class HelloApp {
    public static void main(String[] args) {
        String name = "World";

        if (args.length > 0) {
            // StringBuilder is more efficient than String for joining text
            StringBuilder nameBuilder = new StringBuilder();
            
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                
                // Add a comma and space if it's not the last name
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}