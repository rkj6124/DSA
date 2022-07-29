package com.dsa.DS;

class CustomQueue {

    private int[] array;
    private int end = 0;
    private static final int DEFAULT_SIZE = 10;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.array = new int[size];
    }

    public void add(int val) {
        if (isFull()) {
            doubleSize();
        }
        array[end++] = val;
    }

    private void doubleSize() {
        int[] temp = new int[2 * array.length + 1];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("cannot remove from an empty queue!");
        }
        int removed = array[0];
        for (int i = 1; i < end; i++) {
            array[i-1] = array[i];
        }
        end--;
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("cannot peek from empty queue!");
        }
        return array[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("End");
    }

    public boolean isEmpty() {
        return this.end == 0;
    }

    public boolean isFull() {
        return this.end == array.length;
    }
}
