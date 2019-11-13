package Memento;

public class CarMemento implements Memento {
  private Car originator;
  private int speed;
  private boolean lightsTurnedOn;

  CarMemento(Car originator, int speed, boolean lightsTurnedOn) {
    this.originator = originator;
    this.speed = speed;
    this.lightsTurnedOn = lightsTurnedOn;
  }

  @Override
  public void GetState() {
    speed = originator.getSpeed();
    lightsTurnedOn = originator.isLightsTurnedOn();
  }

  @Override
  public void SetState() {
    originator.setSpeed(speed);
    originator.setLightsTurnedOn(lightsTurnedOn);
  }
}
