package com.dsa.DS;

public class CircularQueue {

  protected int[] array;
  private static final int DEFAULT_SIZE = 10;

  protected int front = 0;
  protected int end = 0;

  private int size = 0;

  public CircularQueue() {
    this(DEFAULT_SIZE);
  }

  public CircularQueue(int size) {
    this.array = new int[size];
  }

  public void add(int val) {
    if (isFull()) {
      doubleSize();
    }
    array[end++] = val;
    end %= array.length;
    size++;
  }

  private void doubleSize() {
    int[] temp = new int[2 * array.length + 1];
    int j = 0;
    for (int i = front; j < size; i = (i+1) % array.length) {
      temp[j++] = array[i];
    }
    array = temp;
    front = 0;
    end = size;
  }

  public int remove() {
    if (isEmpty()) {
      throw new RuntimeException("cannot remove from an empty queue!");
    }
    int removed = array[front++];
    front %= array.length;
    size--;
    return removed;
  }

  public int peek() {
    if (isEmpty()) {
      throw new RuntimeException("cannot peek from empty queue!");
    }
    return array[front];
  }

  /**
   * can use do while here: <p>i = front do print(array[i]) while i != end></p>
   */
  public void display() {
    int modCount = 0;
    for (int i = front; modCount < size; i = (i + 1) % array.length) {
      modCount++;
      System.out.print(array[i] + " ");
    }
    System.out.println("End");
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return this.size == array.length;
  }
}
