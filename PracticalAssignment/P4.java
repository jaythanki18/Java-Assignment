//THIS PROGRAM PREPARED BY Jay Thanki 21CE143
package PracticalAssignment;
class queue {
    private int[] elements;
    private int size;

    public queue() {
        elements = new int[8];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = v;
        size++;
    }

    public int dequeue() {
        // Using elements.length instead of size because the array length is
        // doubled when it needs to be increased instead of just being
        // increased by one.
        int[] temp = new int[elements.length - 1];
        int returnVal = elements[0];

        System.arraycopy(elements, 1, temp, 0, elements.length - 1);
        elements = temp;
        size--;
        return returnVal;
    }
}
public class P4 {
    public static void main(String[] args) {

        queue queue = new queue();

        for (int i = 0; i < 20; i++) {
            queue.enqueue(i + 1);
        }

        int queueSize = queue.getSize();
        System.out.println("Values in the queue are: ");
        for (int j = 0; j < queueSize; j++) {
            System.out.printf("Value %d is: %d%n",
                    j+1, queue.dequeue());
        }
    }
}