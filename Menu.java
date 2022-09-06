import java.util.ArrayList;
import java.util.Scanner;

// class
public class Menu {

  // constructors
  static int itemCount = 0;
  double mainItemPrice;
  double sideItemPrice;
  
  // collection - array list to hold customers order
  static ArrayList<String> customerOrder = new ArrayList<>();
  
  // method               // POLYMORPHISM (method overloading)
  public static void menu(double mainItemPrice, double sideItemPrice) {
    // POLYMORPHISM (method overridding)
    MenuItem myBurger = new Burger(); // create a burger object
    MenuItem myTaco = new Taco(); // create a taco object
    myBurger.orderReply();
    myTaco.orderReply();
    myBurger.yum();
    myTaco.yum();

    // access ECAPSULATED variables
    Burger burger = new Burger(); // create a burger object
    burger.setName("Super Burger");
    burger.setPrice(12.99);
    burger.setIngredients("Sesame Bun, Beef Patty, Cheddar Cheese, Lettuce, Tomato, Ketchup");

    // access ECAPSULATED variables
    Taco taco = new Taco(); // create a taco object
    taco.setName("Crunchy Taco");
    taco.setPrice(08.95);
    taco.setIngredients("Crunchy Shell, Steak, Monterey Jack Cheese, Lettuce, Salsa");

    // access ECAPSULATED variables
    Fries frenchFries = new Fries(); // create a burger object
    frenchFries.setName("Steak fries");
    frenchFries.setPrice(3.49);
    frenchFries.setIngredients("Potatoes, Canola Oil, Beef Flavor, Salt");

    // access ECAPSULATED variables
    Chips potatoChips = new Chips(); // create a burger object
    potatoChips.setName("Cheddar chips");
    potatoChips.setPrice(2.50);
    potatoChips.setIngredients("Potatoes, Canola Oil, Cheddar Cheese, Salt");
    
    // scanner
    Scanner scan = new Scanner(System.in);

    // CLI interface
    System.out.println("\n===================");
    System.out.println("---  Food 2 Go  ---");
    System.out.println("===================");
    System.out.println("Enter customer information to begin a new order");
    
    System.out.println("Name:");
    // get name input
    String customerName = scan.nextLine();
    
    System.out.println("Phone number (xxx-xxx-xxxx):");
    // get phone input
    String customerNumber = scan.nextLine();
    
    System.out.println("\n...................");
    System.out.println("      m e n u");
    System.out.println("...................");
    
    boolean repeat;
    // loop
    do {
      repeat = false;

      System.out.println("\n\nChoose a main item: (enter 1 or 2)");
      System.out.println("#\tItem\t\tPrice\tIngredients");
      System.out.println("-----------------------------------------------");
      System.out.println("1 \t" + burger.getName() + "\t" + burger.getPrice() + "\t" + burger.getIngredients());
      System.out.println("2 \t" + taco.getName() + "\t" + taco.getPrice() + "\t" + taco.getIngredients() +"\n");
      String choice = scan.nextLine();
      
      // switch statement
      switch(choice) {
        // choice 1 - burger
        case "1":
          System.out.println(burger.getName());
          // add item to array
          customerOrder.add(burger.getName());
          // get item price
          mainItemPrice = burger.getPrice();
          // add 1 to item count
          itemCount += 1;

          // nested switch, choose side
          do {
            repeat = false;
            System.out.println("\nChoose a side item: (enter 1 or 2)");
            System.out.println("#\tItem\t\tPrice\tIngredients");
            System.out.println("-----------------------------------------------");
            System.out.println("1 \t" + frenchFries.getName() + "\t" + frenchFries.getPrice() + "\t" + frenchFries.getIngredients());
            System.out.println("2 \t" + potatoChips.getName() + "\t" + potatoChips.getPrice() + "\t" + potatoChips.getIngredients() +"\n");
            String sideChoice = scan.nextLine();
            switch(sideChoice) {
              // choice 1 - fries
              case "1":
                System.out.println(frenchFries.getName());
                // add item to array
                customerOrder.add(frenchFries.getName());
                // get item price
                sideItemPrice = frenchFries.getPrice();
                // add 1 to item count
                itemCount += 1;
                break;
              // choice 2 - chips
              case "2":
                System.out.println(potatoChips.getName());
                // add item to array
                customerOrder.add(potatoChips.getName());
                // get item price
                sideItemPrice = potatoChips.getPrice();
                // add 1 to item count
                itemCount += 1;
                break;
              // exception if choice is not 1 or 2
              default:
                System.out.println("Try again");
                // repeat menu options
                repeat = true;
              }
            } while (repeat);
          break;
//------------------------------------------------------
        // choice 2 - taco
        case "2":
          System.out.println(taco.getName());
          // add item to array
          customerOrder.add(taco.getName());
          // get item price
          mainItemPrice = taco.getPrice();
          // add 1 to item count
          itemCount += 1;
          // nested switch, choose side
          do {
            repeat = false;
            System.out.println("\nChoose a side item: (enter 1 or 2)");
            System.out.println("#\tItem\t\tPrice\tIngredients");
            System.out.println("-----------------------------------------------");
            System.out.println("1 \t" + frenchFries.getName() + "\t" + frenchFries.getPrice() + "\t" + frenchFries.getIngredients());
            System.out.println("2 \t" + potatoChips.getName() + "\t" + potatoChips.getPrice() + "\t" + potatoChips.getIngredients() +"\n");
            String sideChoice = scan.nextLine();
            switch(sideChoice) {
              // choice 1 - fries
              case "1":
                System.out.println(frenchFries.getName());
                // add item to array
                customerOrder.add(frenchFries.getName());
                // get item price
                sideItemPrice = frenchFries.getPrice();
                // add 1 to item count
                itemCount += 1;
                break;
              // choice 2 - chips
              case "2":
                System.out.println(potatoChips.getName());
                // add item to array
                customerOrder.add(potatoChips.getName());
                // get item price
                sideItemPrice = potatoChips.getPrice();
                // add 1 to item count
                itemCount += 1;
                break;
              // exception if choice is not 1 or 2
              default:
                System.out.println("Try again");
                // repeat menu options
                repeat = true;
              }
            } while (repeat);
          break;
//------------------------------------------------------
        // exception if choice is not 1 or 2
        default:
          System.out.println("Try again");
          // repeat menu options
          repeat = true;
      }
    } while (repeat);
    scan.close();

    // count items ordered
    String items = "";
    if (itemCount == 1) {
      items = "item";
    } else {
      items = "items";
    }

    // print reciept
    System.out.println("\n**********************************");
    System.out.println("Thank you " + customerName.toUpperCase() + "! (" + customerNumber + ")");
    System.out.println("**********************************");
    System.out.println("Your order: \t\t (" + itemCount + " " + items + ")");

    // iterate over items added to array and print
    for (String chosenItems : customerOrder) {
      System.out.println(" > " + chosenItems);
    }

    // print order total
    System.out.println("**********************************");
    System.out.println("Order total: $" + (mainItemPrice + sideItemPrice));
    System.out.println("**********************************");
  }
}
