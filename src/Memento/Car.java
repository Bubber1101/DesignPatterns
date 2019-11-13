package Memento;

class Car {
  private int speed;
  private boolean lightsTurnedOn;

  Car() {
    this.speed = 0;
    this.lightsTurnedOn = false;
  }

  int getSpeed() {
    return speed;
  }

  void setSpeed(int speed) {
    this.speed = speed;
  }

  CarMemento createMemento() {
    return new CarMemento(this, speed, lightsTurnedOn);
  }

  boolean isLightsTurnedOn() {
    return lightsTurnedOn;
  }

  void setLightsTurnedOn(boolean lightsTurnedOn) {
    this.lightsTurnedOn = lightsTurnedOn;
  }

  void accelerate() {
    System.out.println("*accelerating*");
    speed += 5;
  }

  void decelerate() {
    System.out.println("*decelerating*");
    speed -= 5;
  }

  void turnLightsOn() {
    System.out.println("*turning lights on*");
    lightsTurnedOn = true;
  }

  void turnLightsOff() {
    System.out.println("*turning lights off*");
    lightsTurnedOn = false;
  }

  @Override
  public String toString() {
    String lights = "turned off";
    if (lightsTurnedOn) lights = "turned on";
    return "Car is travelling at " + speed + "km/h with lights " + lights;
  }
}
