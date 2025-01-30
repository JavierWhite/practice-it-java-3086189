package _02_02;

public class Ticket {

  private String destination;
  private double price;
  private boolean isReturn;

  // Defult Constructor
  public Ticket(String destination, double price, boolean isReturn) {
    // set verables
    this.destination = destination;
    this.price = price;
    this.isReturn = isReturn;
  }

  // setter
  public void setDestination(String destination) {
    this.destination = destination;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setIsReturn(boolean isReturn) {
    this.isReturn = isReturn;
  }

  // getter
  public String getDestination() {
    return destination;
  }

  public double getPrice() {
    return price;
  }

  public boolean getIsReturn() {
    return isReturn;
  }

}
