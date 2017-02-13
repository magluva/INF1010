public class FosCar extends Car {

  private String regNum;
  private String emission;

  public FosCar(String regNum, String emission) {
    super(regNum);
    this.emission = emission;
  }

  public String getEmission() {
    return this.emission;
  }
}
