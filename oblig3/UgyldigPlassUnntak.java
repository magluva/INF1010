class UgyldigPlassUnntak extends RuntimeException {

  UgyldigPlassUnntak(int plass, int storrelse) {
    super(String.format("plass: %d, storrelse: %d", plass, storrelse));
  }

}
