public class PassengerCar extends FosCar {

  String seatNum;

  public PassengerCar(String regNum, String emission, String seatNum) {
    super(regNum, emission);
    this.seatNum = seatNum;
  }

  public String getSeats() {
    return this.seatNum;
  }
}
