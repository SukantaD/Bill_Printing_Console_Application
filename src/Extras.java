import java.util.*;

public class Extras {
    Scanner input = new Scanner(System.in);
    int cheese = 100, topping = 150, pack = 20; // Initializing cheese and topping price

    void extra(PrintBill obj) { // dedicated method for cheese pricing
        obj.price += cheese;
        System.out.println("Extra Cheese:- " + cheese);
    }

    void extra(PrintBill obj, boolean key) { // dedicated overload method for topping pricing
        obj.price += topping;
        System.out.println("Extra Topping:- " + topping);
    }

    void delux(PrintBill obj, String delux) {
        obj.price += cheese + topping;
    }

    void takeAway(PrintBill obj) {
        obj.price += 20;
        System.out.println("Takeaway:- " + pack);
    }
}
