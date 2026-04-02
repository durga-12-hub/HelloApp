class StudentResult {
    public static void main(String[] args) {

        String name = "Sam";
        int rollNumber = 1;
        double percentMarks = 99.99;
        char result = 'P'; // P = Pass, F = Fail

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Percent Marks: " + percentMarks);
        System.out.println("Result: " + result);
    }
class StudentResult {
    public static void main(String[] args) {

        String name = "Sam";
        int rollNumber = 1;
        double percentMarks = 99.99;
        char result;

        if (percentMarks >= 50) {
            result = 'P';
        } else {
            result = 'F';
        }

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Percent Marks: " + percentMarks);
        System.out.println("Result: " + result);
    }
}