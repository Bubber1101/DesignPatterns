package CalculatorChainOfResposibility;

class Divider extends Calculator {
  Divider() {
    super(RequestType.DIVISION, null);
  }

  @Override
  public float calculate(Request request) {
    if (request.getRequestType() == getTYPE()) {
      return getResult(request.getA(), request.getB());
    } else return 0;
  }

  @Override
  public float getResult(float a, float b) {
    return a / b;
  }
}
