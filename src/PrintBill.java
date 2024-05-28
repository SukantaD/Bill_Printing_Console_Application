import java.util.*;

public class PrintBill extends NonVegPizza {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        PrintBill Order = new PrintBill();

        System.out.println("\n-------------------- Welcome to Pizzamania --------------------");
        System.out.println("Menu :-");
        System.out.println("--------------");
        System.out.println("1. Veg Pizza - 300 \n2. Non-Veg Pizza - 400 \n3. Veg Delight Pizza - 550 \n4. Non-Veg Delight Pizza - 650 \nExtra Cheese - 100, Extra Toppings - 150 ");
        System.out.println("------------------------------------------");
        System.out.println("Type your choice :- ");
        int pizzachoice = input.nextInt();

        switch (pizzachoice) {
            case 1:
                Order.pizzaOrder(Order);
                System.out.println("Total Bill:- " + Order.price + "\n");
                break;

            case 2:
                String type = "nonveg"; // intializing String variable to handle method overriding
                Order.pizzaOrder(Order, "nonveg");
                System.out.println("Total Bill:- " + Order.price + "\n");
                break;

            case 3:
                int delight = 1;
                Order.pizzaOrder(Order, delight); // more argument for method overloading in VegPizza class
                System.out.println("Total Bill:- " + Order.price + "\n");
                break;

            case 4:
                delight = 1;
                Order.pizzaOrder(Order, "nonveg", delight); // more argument for method overloading in NonVegPizza class
                System.out.println("Total Bill:- " + Order.price + "\n");
                break;

            default:
                System.out.println("Option not available");
                break;
        }
    }
}
