class FullTabellUnntak extends RuntimeException {

  FullTabellUnntak(int storrelse) {
    super(String.format("storrelse: %d", storrelse));
  }

}
