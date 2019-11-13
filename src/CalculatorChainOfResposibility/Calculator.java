package CalculatorChainOfResposibility;

abstract class Calculator {
  private final RequestType TYPE;
  private Calculator successor;

  Calculator(RequestType TYPE, Calculator successor) {
    this.TYPE = TYPE;
    this.successor = successor;
  }

  public float calculate(Request request) {
    if (request.getRequestType() == TYPE) {
      return getResult(request.getA(), request.getB());
    } else return successor.calculate(request);
  }

  float getResult(float a, float b) {
    return 0;
  }

  public RequestType getTYPE() {
    return TYPE;
  }
}
