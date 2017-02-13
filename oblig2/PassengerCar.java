public class PassengerCar extends FosCar {

  int seatNum;

  public PassengerCar(String regNum, double emission, int seatNum) {
    super(regNum, emission);
    this.seatNum = seatNum;
  }

  public int getSeats() {
    return this.seatNum;
  }
}
