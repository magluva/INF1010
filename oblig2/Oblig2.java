import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Oblig2 {

  public static void main(String [] args) throws IOException {

    System.out.println(readFile(args[0]));
  }

  public static String readFile(String file) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(file));
    StringBuilder sb = new StringBuilder();
    String line = null;
    String emission;

    ArrayList<Car> carList = new ArrayList<Car>();

    try {
      int i = 0;
      while ((line = reader.readLine()) != null) {
        String [] content = reader.readLine().split(" ");
        String make = content[0];
        String reg = content[1];
        switch (make) {

          case "PERSONBIL":
          emission = content[2];
          String seatNum = content[3];
          PassengerCar passengerCar = new PassengerCar(reg, emission, seatNum);
          carList.add(passengerCar);
          break;

          case "LASTEBIL":
          emission = content[2];
          String maxLoad = content[3];
          Truck truck = new Truck(reg, emission, maxLoad);
          carList.add(truck);
          break;

          case "EL":
          String capacity = content[2];
          ElCar elCar = new ElCar(reg, capacity);
          carList.add(elCar);
          break;
        }
      }

      return carList;
    } finally {
      reader.close();
    }
  }


}
