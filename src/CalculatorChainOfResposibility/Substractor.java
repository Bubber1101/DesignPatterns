package CalculatorChainOfResposibility;

 class Substractor extends Calculator {

     Substractor() {
         super(RequestType.SUBSTRACTION, new Multiplier());
     }

     @Override
     public float getResult(float a, float b) {
         return a - b;
     }
 }
