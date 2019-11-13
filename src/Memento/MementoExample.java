package Memento;

import java.util.Scanner;

public class MementoExample {

  public MementoExample() {

    Car car = new Car();
    CarStateSaver carStateSaver = new CarStateSaver();

    Scanner in = new Scanner(System.in);
    String input = "start";
    while (!input.equals("Q")) {
      System.out.println(
          "[A]ccelerate, [D]ecelerate, turn lights o[N], turn lights o[F]f, [S]ave, [L]oad, [P]rint status, [Q]uit");
      input = in.nextLine().substring(0, 1).toUpperCase();

      switch (input) {
        case "Q":
          break;
        case "A":
          car.accelerate();
          break;
        case "D":
          car.decelerate();
          break;
        case "N":
          car.turnLightsOn();
          break;
        case "F":
          car.turnLightsOff();
          break;
        case "P":
          System.out.println(car);
          break;
        case "S":
          carStateSaver.putMemento(car.createMemento());
          break;
        case "L":
          carStateSaver.loadMemento();
          break;
        default:
          System.out.println("sorry, didn't quite catch that?");
      }
    }
  }
}
