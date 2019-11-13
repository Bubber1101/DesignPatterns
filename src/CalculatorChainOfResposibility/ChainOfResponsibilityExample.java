package CalculatorChainOfResposibility;

public class ChainOfResponsibilityExample {
    private Additor additor;

    public ChainOfResponsibilityExample() {
        additor = new Additor();
        Request requestAdd = new Request(10,10, RequestType.ADDITION);
        Request requestSubtract = new Request(20,10, RequestType.SUBSTRACTION);
        Request requestMultiply = new Request(20,10, RequestType.MULTIPLICATION);
        Request requestDivide = new Request(20,10, RequestType.DIVISION);
        System.out.println(requestAdd.getA() + " + " + requestAdd.getB() + " = " + getResult(requestAdd));
        System.out.println(requestSubtract.getA() + " - " + requestSubtract.getB() + " = " + getResult(requestSubtract));
        System.out.println(requestMultiply.getA() + " * " + requestMultiply.getB() + " = " + getResult(requestMultiply));
        System.out.println(requestDivide.getA() + " / " + requestDivide.getB() + " = " + getResult(requestDivide));
    }
    private float getResult(Request request){
       return additor.calculate(request);
    }
}
