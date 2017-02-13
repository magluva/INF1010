import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Oblig2 {

  public static void main(String [] args) throws IOException {

    ArrayList<Car> carList = readFile(args[0]);

    try {
      if (args[1].equals("FOS")) {
        for (Car car : carList) {
          if (car instanceof PassengerCar) {
            PassengerCar pCar = (PassengerCar)car;
            System.out.println(pCar.getSeats());
            System.out.println("Passed passenger car");
          } else if (car instanceof Truck){
            Truck tCar = (Truck)car;
            tCar.getMaxLoad();
            System.out.println("Passed truck");
          }
        }
      }
      else if (args[1].equals("EL")) {
        for (Car car : carList) {
          if (car instanceof ElCar) {
            ElCar eCar = (ElCar)car;
            eCar.getCapacity();
            System.out.println("Passed electric car");
          }
        }
      }
    }
    catch (ArrayIndexOutOfBoundsException e) {
      for (Car car : carList) {
        if (car instanceof PassengerCar) {
          PassengerCar pCar = (PassengerCar)car;
          pCar.getSeats();
          System.out.println("Passed passenger car");
        } else if (car instanceof Truck){
          Truck tCar = (Truck)car;
          tCar.getMaxLoad();
          System.out.println("Passed truck");
        } else {
          ElCar eCar = (ElCar)car;
          eCar.getCapacity();
          System.out.println("Passed electric car");
        }
      }
    }
  }

  public static ArrayList<Car> readFile(String file) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(file));
    StringBuilder sb = new StringBuilder();
    String line = null;
    double emission;

    ArrayList<Car> carList = new ArrayList<Car>();

    try {
      int i = 0;
      while ((line = reader.readLine()) != null) {
        String  [] content = line.split(" ");
        String make = content[0];
        String reg = content[1];

        switch (make) {

          case "PERSONBIL":
          emission = Double.parseDouble(content[2]);
          int seatNum = Integer.parseInt(content[3]);
          PassengerCar passengerCar = new PassengerCar(reg, emission, seatNum);
          carList.add(passengerCar);
          break;

          case "LASTEBIL":
          emission = Double.parseDouble(content[2]);
          double maxLoad = Double.parseDouble(content[3]);
          Truck truck = new Truck(reg, emission, maxLoad);
          carList.add(truck);
          break;

          case "EL":
          double capacity = Double.parseDouble(content[2]);
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
/*
  public static void printFos(ArrayList<Car> carList) {

    for (Car car : carList) {
        if (car instanceof PassengerCar) {
          PassengerCar pCar = (PassengerCar)car;
          pCar.getSeats();
          System.out.println("Passed passenger car");
        } else {
          Truck tCar = (Truck)car;
          tCar.getMaxLoad();
          System.out.println("Passed truck");
        }
      }
    }
    else if (args[1].equals("EL")) {
      for (Car car : carList) {
        if (car instanceof ElCar) {
          ElCar eCar = (ElCar)car;
          eCar.getCapacity();
          System.out.println("Passed electric car");
        }
      }
    } else {
      for (Car car : carList) {
        PassengerCar PassengerCar = (PassengerCar)car;
        pCar.getSeats();
        Truck tCar = (Truck)car;
        tCar.getMaxLoad();
        Elcar eCar = (ElCar)car;
        eCar.getCapacity();
        System.out.println("Total passed");
      }

    }
  }
  */
}
