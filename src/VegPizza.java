class VegPizza extends Extras {
    int price;

    void pizzaOrder(PrintBill obj) {
        obj.price = 300;

        System.out.println("Do you want Extra Cheese or Toppings ? (y/n)");
        char extra = input.next().toLowerCase().charAt(0);      /* taking string input then 
                                                                        lowercase then first element into char */

        if (extra == 'y') {
            System.out.println("\n1. Extra Cheese \n2. Extra Toppings");
            int extrachoice = input.nextInt();

            System.out.println("\nDo you want Takeaway ? (y/n)");
            char take = input.next().toLowerCase().charAt(0);

            System.out.println("\nVeg Pizza:- " + obj.price);

            if (extrachoice == 1) {
                extra(obj);
            } else if (extrachoice == 2) {
                boolean type = false;           // initializilg bool variable to handle method overloading
                extra(obj, type);
            } else {
                System.out.println("\nCould not add extra");
            }

            if(take == 'y'){
                takeAway(obj);
            }
        }

        if (extra == 'n') {
            System.out.println("\nDo you want Takeaway ? (y/n)");
            char take = input.next().toLowerCase().charAt(0);
            
            System.out.println("\nVeg Pizza:- " + obj.price);

            if(take == 'y'){
                takeAway(obj);
            }
        }
    }

    void pizzaOrder(PrintBill obj, int delight) {       // method overloading with more argument
        obj.price = 300;

        System.out.println("\nDo you want Takeaway ? (y/n)");
        char take = input.next().toLowerCase().charAt(0);

        System.out.println("\nVeg Pizza:- " + obj.price);
        extra(obj);
        boolean key = false;
        extra(obj, key);

        if(take == 'y'){
            takeAway(obj);
        }
    }
}