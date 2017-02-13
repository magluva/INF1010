public class PassengerCar extends FosCar {

  int seatNum;

  public PassengerCar(String regNum, double emission, int seatNum) {
    super(regNum, emission);
    this.seatNum = seatNum;
  }

  public void getSeats() {
    System.out.println("Type: Passenger car");
    super.getEmission();
    System.out.println("Number of seats: " + this.seatNum);
    System.out.println("");
  }
}
