import java.util.ArrayList;

class Cluster {
  int nodesInRack;
  ArrayList<Rack> racks = new ArrayList<Rack>();

  public Cluster(int num) {
    nodesInRack = num;
  }

  public void newNode(Node node) {
    boolean occupied = false;

    for (Rack rack : racks) {
      if (rack.nodes.size() < nodesInRack) {
        rack.addNode(node);
        occupied = true;
      }
    }
    if (!occupied) {
      Rack rack = new Rack();
      racks.add(rack);
      rack.addNode(node);
    }
  }
  public double flops() {
    double flopsCluster = 0;
    int operations = 8;

    for (Rack rack : racks) {
      for (Node node : rack.nodes) {
        double flopsNode = node.processors.get(0).coreNum * node.cpus * node.processors.get(0).clockSpeed * operations;
        flopsCluster += flopsNode;
      }
    }
    return flopsCluster;
  }

  public int nodesMemory(int neededMem) {
    int usableNodes = 0;

    for (Rack rack : racks) {
      for (Node node : rack.nodes) {
        if (node.memorySize >= neededMem) {
          usableNodes++;
        }
      }
    }
    return usableNodes;
  }
}
