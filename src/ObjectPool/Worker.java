package ObjectPool;

import java.util.UUID;

class Worker extends Thread {
  private String uuid;
  private WorkerStatus status;
  private Order order;

  Worker() {
    this.uuid = UUID.randomUUID().toString().substring(0, 3);
    status = WorkerStatus.INACTIVE;
  }

  @Override
  public void run() {
    setStatus(WorkerStatus.AWAITING_ORDERS);
    while (status != WorkerStatus.INACTIVE) {
        if (status == WorkerStatus.BUSY && order != null) {
          executeOrder();
      }
      try {
        sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  private void executeOrder() {
    System.out.println("Producer no." + uuid + " is executing an order no." + order.getId());
    try {
      sleep(order.getId());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    order = null;
    setStatus(WorkerStatus.AWAITING_ORDERS);
  }

  void setOrder(Order order) {
    setStatus(WorkerStatus.BUSY);
    this.order = order;
  }

  private void setStatus(WorkerStatus status) {
    this.status = status;
    System.out.println("Producer no." + uuid + " " + status.getStatusChangeMessage());
  }

  WorkerStatus getStatus() {
    return status;
  }
}
