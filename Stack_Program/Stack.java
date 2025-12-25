public class Stack {
    int arr[] = new int[5];
    int top = -1;

    public void push(int x) {
        top++;
        arr[top] = x;
    }

    public int pop() {
        int x = arr[top];
        top--;
        return x;
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);

        System.out.println(s.pop()); // 20
        System.out.println(s.pop()); // 10
    }
}
