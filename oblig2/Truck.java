public class Truck extends FosCar {

  double maxLoad;

  public Truck(String regNum, double emission, double maxLoad) {
    super(regNum, emission);
    this.maxLoad = maxLoad;
  }

  public double getMaxLoad() {
    //System.out.println("Max weight: " + this.maxLoad);
    return this.maxLoad;
  }
}
