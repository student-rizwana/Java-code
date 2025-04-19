public class JavaConceptDemo {
    public static void main(String[] args) {
        // Variables and Data Types
        int num = -5;
        double decimalNum = 10.5;
        char grade = 'A';
        String name = "Rizwana";

        // If-Else Statement
        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println(num + " is Zero");
        }

        // Switch Statement
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        // For loop: first 10 natural numbers
        System.out.println("First 10 natural numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While loop: sum of numbers from 1 to 10
        int sum = 0, i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Do-while loop: print 1 to 10
        int j = 1;
        System.out.println("Numbers from 1 to 10 using do-while loop:");
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 10);
        System.out.println();

        // Arithmetic, Relational, and Logical Operators
        int a = 5, b = 10;
        System.out.println("a + b = " + (a + b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a > 0 && b > 0: " + (a > 0 && b > 0));
    }
}
