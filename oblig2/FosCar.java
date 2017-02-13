public class FosCar extends Car {

  private String regNum;
  private double emission;

  public FosCar(String regNum, double emission) {
    super(regNum);
    this.emission = emission;
  }

  public double getEmission() {
    return this.emission;
  }
}
