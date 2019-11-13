package ObjectPool;

class Order {

  private Long id;

  Order(Long id) {
    this.id = id;
  }

  Long getId() {
    return id;
  }
}
