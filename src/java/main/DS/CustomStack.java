class CustomStack {

    private int[] array;
    private int size;
    private static int DEFAULT_CAPACITY = 10;

    public CustomStack() {
       this.array = new int[DEFAULT_CAPACITY];
       this.size = 0;
    }

    public void push(int val) {
        if(isFull()) {
            int[] temp = new int[2 * size + 1];
            for (int i = 0; i < size; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[size++] = val;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot peek into an empty stack!");
        }
        return array[size-1];
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot pop from an empty stack!");
        }
        return array[--size];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == array.length;
    }

}
