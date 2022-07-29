class CustomQueue {

    private int array[];
    private int start;
    private int end;
    private static int DEFAULT_SIZE = 10;

    public CustomQueue() {
        this.array = new int[CustomQueue.DEFAULT_SIZE];
        this.start = this.end = -1;
    }

    public void add(int val) {

    }

    public int remove() {

    }

    public int peek() {

    }

    public void display() {

    }

    public boolean isEmpty() {
        return this.end == -1;
    }

    public boolean isFull() {
        return this.end == size
    }
}
