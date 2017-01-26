public class Sirkel {
  private double r;
  private double d;
  private double answer;

  public Sirkel(double r) {
    this.r = r;
  }

  public double getCirc() {
    answer = Math.PI * Math.pow(r, 2);
    return answer;
  }

  public double getArea() {
    answer = (2 * r) * Math.PI;
    return answer;
  }
}
