import java.util.ArrayList;

/**
  This is a QueueExample class that demonstrates how to implement a queue data structure in Java.
  The queue stores elements in a first-in, first-out (FIFO) order, and provides methods for adding
  and removing elements, as well as checking the size and contents of the queue.
 */

public class QueueExample {

    // Declare an ArrayList to store the queue
    ArrayList<Integer> queue;

    // Initialize the ArrayList in the constructor
    public QueueExample() {
        queue = new ArrayList<Integer>();
    }

    // Add the item to the end of the queue
    public void enqueue(int item) {
        queue.add(item);
    }

    // If the queue is empty, return -1 and print an error message
    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        // Remove and return the item at the front of the queue
        return queue.remove(0);
    }

    // Check if the queue is empty and return true or false
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Return the number of elements in the queue
    public int size() {
        return queue.size();
    }

    // If the queue is empty, return -1 and print an error message
    public int peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        // Return the item at the front of the queue without removing it
        return queue.get(0);
    }
}
