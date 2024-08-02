import java.util.Scanner;

public class CalculatorProbDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("******************************");
            System.out.println("Welcome to My Calculator...");
            System.out.println("******************************");

            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Subtraction");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");


            System.out.println("Enter your input ");
            input = scanner.nextInt();

            if (input == 0) {
                System.out.println("Exit");
                break;
            }

            System.out.println("Enter your first Number");
            int num1 = scanner.nextInt();
            System.out.println("Enter your second Number");

            int num2 = scanner.nextInt();


            switch (input) {
                case 1:
                    int sum = num1 + num2;
                    System.out.println("1. Addition of two number is: " + sum);
                    break;
                case 2:
                    int mul = num1 * num2;
                    System.out.println("2. Multiplication of two number is: " + mul);
                    break;

                case 3:
                    int sub = num1 - num2;
                    System.out.println("3. Subtraction of two number is: " + sub);
                    break;
                case 4:
                    float div = (float) num1 / num2;
                    System.out.println("4. Division of two number is: " + div);
                    break;
                case 5:
                    double mod = (double) num1 % num2;
                    System.out.println("5. Modulus of two number is: " + mod);
                    break;
                default:
                    System.out.println("Wrong input ");

            }
            System.out.println();
        }
        while(input != 0);
       scanner.close();

}
}
