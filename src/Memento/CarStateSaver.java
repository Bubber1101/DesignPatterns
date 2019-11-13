package Memento;

import java.util.Stack;

class CarStateSaver {
  private final String SAVE_MESSAGE = "___QuickSaving___";
  private final String LOAD_MESSAGE = "___QuickLoading___";
  private final String NO_SAVES = "__There are no saves__";
  private Stack<Memento> mementos;

  public CarStateSaver() {
    mementos = new Stack<Memento>();
  }

  void putMemento(Memento memento) {
    System.out.println(SAVE_MESSAGE);
    mementos.push(memento);
  }

  void loadMemento() {
    if (!mementos.empty()) {
      System.out.println(LOAD_MESSAGE);
      mementos.pop().SetState();
    } else System.out.println(NO_SAVES);
  }
}
