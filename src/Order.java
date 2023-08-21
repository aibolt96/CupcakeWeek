import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu){
        System.out.println("Hello, would you like to place an order? (Y/N)");
        Scanner input = new Scanner(System.in);
        String placeOrder = input.nextLine();
        ArrayList<Object> order = new ArrayList<Object>();
        if (placeOrder.equalsIgnoreCase("Y")){
            order.add(LocalDate.now());
            order.add(LocalTime.now());
            System.out.println("Here is the menu.");
            System.out.println("CUPCAKES:");
            int itemNumber = 0;
            for (int i = 0; i < cupcakeMenu.size(); i++){
                itemNumber++;
                System.out.println(itemNumber);
                cupcakeMenu.get(i).type();
                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());
                System.out.println();
            }
            System.out.println("Drinks:");
            for (int i = 0; i < drinkMenu.size(); i++){
                itemNumber++;
                System.out.println(itemNumber);
                drinkMenu.get(i).type();
                System.out.println("Price: $" + drinkMenu.get(i).getPrice());
                System.out.println();
            }

            boolean ordering = true;

            while (ordering) {
                System.out.println("What would you like to order? Please place order using the item number.");
                int orderChoice = input.nextInt();
                input.nextLine();
                if (orderChoice == 1){
                    order.add(cupcakeMenu.get(1));
                    System.out.println("Item added to order.");
                } else if (orderChoice == 2){
                    order.add(cupcakeMenu.get(2));
                    System.out.println("Item added to order.");
                } else if (orderChoice == 3){
                    order.add(cupcakeMenu.get(3));
                    System.out.println("Item added to order.");
                } else if (orderChoice == 4){
                    order.add(cupcakeMenu.get(4));
                    System.out.println("Item added to order.");
                } else if (orderChoice == 5){
                    order.add(cupcakeMenu.get(5));
                    System.out.println("Item added to order.");
                } else if (orderChoice == 6){
                    order.add(cupcakeMenu.get(6));
                    System.out.println("Item added to order.");
                } else {
                    System.out.println("Sorry, that is not on the menu.");
                }
                System.out.println("Would you like to continue ordering? (Y/N)");
                placeOrder = input.nextLine();
                if (!placeOrder.equalsIgnoreCase("Y")){
                    ordering = false;
                }
            }
        } else {
            System.out.println("Have a nice day then!");
        }
    }
}