package com.dsa.DS;

public class CircularQueueImpl {

  public static void main(String[] args) {
    CircularQueue circularQueue = new CircularQueue(5);
    circularQueue.add(1);
    circularQueue.add(2);
    circularQueue.add(3);
    circularQueue.add(4);
    circularQueue.add(5);


    circularQueue.display();

    circularQueue.remove(); // 1
    circularQueue.remove(); // 2
    circularQueue.remove(); // 3

    circularQueue.display();

    circularQueue.add(6);
    circularQueue.add(7);
    circularQueue.add(8);
    circularQueue.add(9);
    circularQueue.add(10);
    circularQueue.add(11);
    circularQueue.add(12);
    circularQueue.add(13);
    circularQueue.add(14);
    circularQueue.add(15);
    circularQueue.add(16);

    circularQueue.display();
  }
}
