import java.util.ArrayList;

class Oblig01 {
  public static void main(String[] args) {
    Cluster abel = new Cluster(12);

    for (int i=0; i<650; i++) {
      Node node = new Node(64, 8, 2.6*Math.pow(10, 9), 2);
      abel.newNode(node);
    }

    for (int i=0; i<16; i++) {
      Node node = new Node(1024, 8, 2.3*Math.pow(10, 9), 2);
      abel.newNode(node);
    }
    System.out.println("Samlet FLOPS: " + abel.flops());
    System.out.println("Noder med minst 32 GB: " + abel.nodesMemory(32));
    System.out.println("Noder med minst 64 GB: " + abel.nodesMemory(64));
    System.out.println("Noder med minst 120 GB: " + abel.nodesMemory(120));
    System.out.println("Antall rack: " + abel.racks.size());

  }
}
