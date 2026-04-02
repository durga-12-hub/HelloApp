public class HelloApp {

    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build string with comma
        StringBuilder nameBuilder = new StringBuilder();

        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove last ", " using substring
        String result = nameBuilder.substring(0, nameBuilder.length() - 2);

        // Print final output
        System.out.println("Hello, " + result + "!");
    }
}