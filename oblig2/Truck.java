public class Truck extends FosCar {

  double maxLoad;

  public Truck(String regNum, double emission, double maxLoad) {
    super(regNum, emission);
    this.maxLoad = maxLoad;
  }

  public void getMaxLoad() {
    System.out.println("Type: Truck");
    super.getEmission();
    System.out.println("Max weight: " + this.maxLoad);
    System.out.println("");
  }
}
