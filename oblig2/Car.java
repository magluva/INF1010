public class Car {

  private String regNum;

  Car(String regNum) {
    this.regNum = regNum;
  }

  public void getReg() {
    System.out.println("Registration number: " + this.regNum);
  }

}
