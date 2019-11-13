package CalculatorChainOfResposibility;

class Multiplier extends Calculator {

  Multiplier() {
    super(RequestType.MULTIPLICATION, new Divider());
  }

  @Override
  public float getResult(float a, float b) {
    return a * b;
  }
}
