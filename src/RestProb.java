import java.util.Scanner;

public class RestProb {

    /*
    * enter your selection
    * 1.pizza
    *   1. peproni pizza
    *   2. cheese pizza
    * 2.burger
    *    1. chicken burger
    *    2. meat burger
    *    3. veg burger
    * 3.frenchfries
    *
    * 4.Drinks
    *   1. cadara dry
    *   2.sprite
    *   3. cococola
    *
    * */

    public static void main(String[] args) {

        boolean run = true;
        while (run){

            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Street Food");
            System.out.println("Enter Your Choice");
            System.out.println("1.Pizza");
            System.out.println("2.Burger");
            System.out.println("3.French fries");
            System.out.println("4.Drinks");

            int mainSelect = sc.nextInt();

            if (mainSelect == 1){
                System.out.println("You selected for pizza");
                System.out.println("1. Peproni Pizza");
                System.out.println("2. Cheeze Pizza");

                int pizzaSelection = sc.nextInt();
                switch(pizzaSelection) {

                    case 1:
                        System.out.println("You selected Peproni");
                        break;
                    case 2:
                        System.out.println("You selected Cheese Pizza");
                        break;

                }
            } else if (mainSelect == 2) {
                System.out.println("You selected for burger");
                System.out.println("1. chicken burger");
                System.out.println("2. meat burger");
                System.out.println("3. veg burger");

                int burgerSelection = sc.nextInt();
                switch (burgerSelection) {
                    case 1:
                        System.out.println("You selected chicken burger");
                        break;
                    case 2:
                        System.out.println("You selected meat burger");
                        break;
                    case 3:
                        System.out.println("You selected veg burger");
                        break;
                }
            }
            else if (mainSelect == 3){
                System.out.println("You selected for French fries");

            } else if (mainSelect == 4) {
                System.out.println("You selected for Drinks");
                System.out.println("1.Canada Dry");
                System.out.println("2.Sprite");
                System.out.println("3.Coco Cola");

                int drinkSelection = sc.nextInt();
                switch (drinkSelection) {
                    case 1:
                        System.out.println("You selected Canada Dry");
                        break;
                    case 2:
                        System.out.println("You selected Sprite");
                        break;
                    case 3:
                        System.out.println("You selected Coco Cola");
                        break;
                }

            }else
            System.out.println("Wrong Selection");
            }

        }

    }

