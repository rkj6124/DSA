class StackImpl {

    public static void main (String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Display : ");
        stack.display();

        System.out.println("Peek : ");
        System.out.print(stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Display : ");
        stack.display();
    }
}
