package ObjectPool;

public enum WorkerStatus {
  INACTIVE("is now inactive"),
  AWAITING_ORDERS("Is up and awaiting orders"),
  BUSY("has received an order and is processing it");

  private String statusChangeMessage;

  WorkerStatus(String s) {
    this.statusChangeMessage = s;
  }

  public String getStatusChangeMessage() {
    return statusChangeMessage;
  }
}
