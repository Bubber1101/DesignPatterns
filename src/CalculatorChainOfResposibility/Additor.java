package CalculatorChainOfResposibility;

class Additor extends Calculator {

  Additor() {
    super(RequestType.ADDITION, new Substractor());
  }

  @Override
  public float getResult(float a, float b) {
    return a + b;
  }
}
