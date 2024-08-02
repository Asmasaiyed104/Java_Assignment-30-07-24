import java.util.Scanner;

public class IVRProb {
    /*
    * public class IVRDemo {
    public static void main(String[] args) {

        /*

// Assignment
        Rogers tech support

        Press 1 for english
           Press 1 Internet
           Press 2 Billing
                 Press 1 Current Bill
                 Press 2 Last Bill
                 Press 3 talk to Agent
           Press 3 Mobile
           Press 4 Tech support
           Press 5 something
        Press 2 for French


        If else
        Switch case
        both

         */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean start = true;

        while(start) {

            System.out.println("**********************************");
            System.out.println("Rogers tech support");
            System.out.println("**********************************");
            System.out.println("Press 1 English");
            System.out.println("Press 2 French");


            System.out.println("Enter your Selection");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Selected English");
                    System.out.println("Press 1 Internet");
                    System.out.println("Press 2 Billing");
                    System.out.println("Press 3 for Mobile");
                    System.out.println("Press 4 for Tech support");
                    System.out.println("Press 5 for something else");
                    System.out.println("Enter your Selection: ");

                    int engSelect = sc.nextInt();
                    switch (engSelect) {
                        case 1:
                            System.out.println("Selected Internet");
                            break;
                        case 2:
                            System.out.println("Selected Billing");
                            System.out.println("Press 1 for Current Bill");
                            System.out.println("Press 2 for Last Bill");
                            System.out.println("Press 3 to talk to Agent");
                            System.out.println("Enter your Selection: ");

                            int billinSelecet = sc.nextInt();

                            switch (billinSelecet) {
                                case 1:
                                    System.out.println("Selected current billing");
                                    break;
                                case 2:
                                    System.out.println("Selected last bill");
                                    break;
                                case 3:
                                    System.out.println("Selected talk to agent");
                                    break;
                                default:
                                    System.out.println("Invalid selection");
                            }
                            break;
                        case 3:
                            System.out.println("Selected Mobile");
                            break;
                        case 4:
                            System.out.println("Selected Tech Support");
                            break;
                        case 5:
                            System.out.println("Selected something else");
                            break;
                        default:
                            System.out.println("Invalid selection");

                    }
                    break;
                case 2:
                    System.out.println("Selected French");
                    break;
                default:
                    System.out.println("Invalid selection");

            }
        }
        sc.close();
       }

        }







