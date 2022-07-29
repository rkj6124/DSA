package com.dsa.DS;

public class QueueImpl {

  public static void main(String[] args) {
    CustomQueue queue = new CustomQueue();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);

    queue.display();

    queue.remove();
    queue.remove();

    queue.display();
  }
}
