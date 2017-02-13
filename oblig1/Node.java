import java.util.ArrayList;

class Node {
  int memorySize;
  int cpus;
  ArrayList<Processor> processors = new ArrayList<Processor>();

  public Node(int memory, int cores, double speed, int num) {
    memorySize = memory;
    cpus = num;

    for (int i=0; i < cpus; i++) {
      Processor cpu = new Processor(cores, speed);
      processors.add(cpu);
    }
  }
}
