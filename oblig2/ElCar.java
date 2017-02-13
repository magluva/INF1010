public class ElCar extends Car {

  private String regNum;
  private double capacity;

  public ElCar(String regNum, double capacity) {
    super(regNum);
    this.capacity = capacity;
  }

  public String getCapacity() {
    return this.capacity;
  }
}
