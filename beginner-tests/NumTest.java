public class NumTest {

  public static void main(String[] args) {

    Kvadrat test = new Kvadrat(2.5);
    System.out.println("Kvadrat circumference and area: ");
    System.out.println(test.getCirc());
    System.out.println(test.getArea());

    Sirkel test1 = new Sirkel(2.5);
    System.out.println("Sirkel circumference and area: ");
    System.out.println(test1.getCirc());
    System.out.println(test1.getArea());

    System.out.println("done...");


  }

}
