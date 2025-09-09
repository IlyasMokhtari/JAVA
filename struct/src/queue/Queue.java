package queue;

import java.util.NoSuchElementException;

/**
 * A class representing a Queue.
 */
public class Queue {

    /**
     * The first element of the queue (head).
     */
    private Cell head;

    /**
     * The last element of the queue (tail).
     */
    private Cell tail;

    /**
     * Constructs an empty Queue.
     */
    public Queue() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Inserts a value at the end of the queue (tail).
     *
     * @param value the integer value to add to the queue
     */
    public void enqueue(int value) {
        Cell cell = new Cell(value, null);
        if (this.isEmpty()) {
            this.head = cell;
            this.tail = cell;
        } else {
            this.tail.setNext(cell);
            this.tail = cell;
        }
    }

    /**
     * Removes and returns the value at the beginning of the queue (head).
     *
     * @return the integer value at the head of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public int dequeue() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        int value = this.head.getValue();
        if (this.head.equals(this.tail)) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.getNext();
        }
        return value;
    }

    /**
     * Returns the head.
     *
     * @return the head
     * @throws NoSuchElementException if the queue is empty
     */
    public Cell getHead() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.head;
    }

    /**
     * Returns the tail.
     *
     * @return the tail
     * @throws NoSuchElementException if the queue is empty
     */
    public Cell getTail() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.tail;
    }

    /**
     * Checks whether the queue is empty.
     *
     * @return true if the queue has no elements, false otherwise
     */
    public boolean isEmpty() {
        return this.head == null && this.tail == null;
    }
}
