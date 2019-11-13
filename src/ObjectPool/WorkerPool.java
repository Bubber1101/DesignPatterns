package ObjectPool;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class WorkerPool {
  private static WorkerPool instance = null;
  private List<Worker> pool;

  private WorkerPool() {
    pool = Arrays.asList(new Worker(), new Worker(), new Worker());
    pool.forEach(Thread::start);
  }

  static WorkerPool getInstance() {
    if (instance == null) instance = new WorkerPool();
    return instance;
  }

  Optional<Worker> getWorker() {
    return pool.stream()
        .filter(worker -> worker.getStatus().equals(WorkerStatus.AWAITING_ORDERS))
        .findFirst();
  }
}
