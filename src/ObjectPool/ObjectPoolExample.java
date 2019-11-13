package ObjectPool;

import sun.misc.Queue;

public class ObjectPoolExample extends Thread {

  private Queue<Order> orderQueue;

  public ObjectPoolExample() {
    System.out.println("Object Pool example started");
    orderQueue = new Queue<>();
    orderQueue.enqueue(new Order(400L));
    orderQueue.enqueue(new Order(200L));
    orderQueue.enqueue(new Order(1L));
    orderQueue.enqueue(new Order(100L));
    start();
  }

  @Override
  public void run() {
    do{
      try {
        Order order = orderQueue.dequeue();
        WorkerPool.getInstance().getWorker().ifPresent(worker -> worker.setOrder(order));
        sleep(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    while (!orderQueue.isEmpty());
  }
}
