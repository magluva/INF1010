public class ElCar extends Car {

  private String regNum;
  private double capacity;

  public ElCar(String regNum, double capacity) {
    super(regNum);
    this.capacity = capacity;
  }

  public void getCapacity() {
    System.out.println("Type: Electric car");
    super.getReg();
    System.out.println("Battery capacity: " + this.capacity);
    System.out.println("");
  }
}
