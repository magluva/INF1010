public class ElCar extends Car {

  private String regNum;
  private double capacity;

  public ElCar(String regNum, double capacity) {
    super(regNum);
    this.capacity = capacity;
  }

  public double getCapacity() {
    return this.capacity;
  }
}
