package CalculatorChainOfResposibility;

class Request {
  private float a;
  private float b;
  private RequestType requestType;

  public Request(float a, float b, RequestType requestType) {
    this.a = a;
    this.b = b;
    this.requestType = requestType;
  }

  float getA() {
    return a;
  }

  float getB() {
    return b;
  }

  RequestType getRequestType() {
    return requestType;
  }
}
