import java.util.Scanner;

public class Menu {
    public double subTotal;
    public static double runningTotal;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println(
                "Welcome \n1. Nasi Goreng (RM10.00) \n2. Mee Goreng (RM7.50)\n3. Bihun (RM7.00) \n4. Kuey Teow (RM8.00) \n5. Orange Juice (RM5.00) \n6. Soda (RM2.00) \n7. Done");
    }

    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            // Nasi Goreng = RM10.00
            System.out.println("You've ordered a  Nasi Goreng");
            itemPrice = 10.00;
        }
        if (foodItem == 2) {
            // Mee Goreng = RM7.50
            System.out.println("You've ordered Mee Goreng");
            itemPrice = 7.50;
        }
        if (foodItem == 3) {
            // Bihun = RM7.00
            System.out.println("You've ordered a Bihun");
            itemPrice = 7.00;
        }
        if (foodItem == 4) {
            // Kuey Teow = RM8.00
            System.out.println("You've ordered a Kuey Teow");
            itemPrice = 8.00;
        }
        if (foodItem == 5) {
            // Orange Juice = RM5.00
            System.out.println("You've ordered a Orange Juice ");
            itemPrice = 8.00;
        }
        if (foodItem == 6) {
            // Soda = RM2.00
            System.out.println("You've ordered a Soda");
            itemPrice = 2.00;
        }
        quantity();
        return itemPrice;
    }

    public static double quantity() {
        System.out.println("Enter quantity");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }

    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: " + subTotal);
        return subTotal;
    }

    public static void done(double runningTotal) {
        ordering = false;
        System.out.println(runningTotal);
        System.out.println("Enjoy your meal");
    }

    public static void main(String[] args) {
        int menuOption;
        int foodItem = 0;
        input = new Scanner(System.in);
        do {
            double runningTotal = 0;
            menu();
            menuOption = input.nextInt();
            switch (menuOption) {
                case 1:
                    foodItem = 1;
                    itemPrice(foodItem);
                    break;
                case 2:
                    foodItem = 2;
                    itemPrice(foodItem);
                    break;
                case 3:
                    foodItem = 3;
                    itemPrice(foodItem);
                    break;
                case 4:
                    foodItem = 4;
                    itemPrice(foodItem);
                    break;
                case 5:
                    foodItem = 5;
                    itemPrice(foodItem);
                    break;
                case 6:
                    foodItem = 6;
                    itemPrice(foodItem);
                    break;
                case 7:
                    done(runningTotal);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (ordering);
        {
            subTotal(quantity(), itemPrice(foodItem));
            runningTotal = runningTotal + subTotal(quantity(), itemPrice(foodItem));
        }
    }
}