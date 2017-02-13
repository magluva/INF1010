public class Truck extends FosCar {

  String maxLoad;

  public Truck(String regNum, String emission, String maxLoad) {
    super(regNum, emission);
    this.maxLoad = maxLoad;
  }

  public String getMaxLoad() {
    System.out.println("Max weight: " + this.maxLoad);
    return this.maxLoad;
  }
}
