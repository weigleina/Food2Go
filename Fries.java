// subclass INHERITS from MenuItem class
class Fries extends MenuItem {
  
  // ENCAPSULATION - Constructors
  private String name;
  private double price;
  private String ingredients;

  // ENCAPSULATION Getter
  public String getName() {
    return name;
  }

  // ENCAPSULATION Setter
  public void setName(String newName) {
    this.name = newName;
  }

  // ENCAPSULATION Getter
  public double getPrice() {
    return price;
  }

  // ENCAPSULATION Setter
  public void setPrice(double newPrice) {
    this.price = newPrice;
  }

  // ENCAPSULATION Getter
  public String getIngredients() {
    return ingredients;
  }

  // ENCAPSULATION Setter
  public void setIngredients(String newIngredients) {
    this.ingredients = newIngredients;
  }
  
  // method
  public void orderReply() {
    System.out.print("I hope you like fries!");
  }
}