class Kvadrat {
  private double length;
  private double answer;

  public Kvadrat(double length) {
    this.length = length;
  }
  public double getCirc() {
    answer = 4 * this.length;
    return answer;
  }
  public double getArea() {
    answer = 2 * this.length;
    return answer;
  }
}
