package stack;
import java.util.EmptyStackException;

/**
 * A class for Stack.
 */
public class Stack {

    /**
     * The top element of the stack.
     */
    private Cell top;

    /**
     * Constructs an empty Stack.
     */
    public Stack() {
        this.top = null;
    }

    /**
     * Pushes a value onto the top of the stack.
     * 
     * @param value the integer value to push onto the stack
     */
    public void push(int value) {
        this.top = new Cell(value, this.top);
    }

    /**
     * Removes and returns the value at the top of the stack.
     * 
     * @return the integer value at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public int pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        int val = this.top.getValue();
        this.top = this.top.getPrev();
        return val;
    }

    /**
     * Checks whether the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return this.top == null;
    }

    /**
     * Returns the top Cell of the stack.
     * 
     * @return the Cell at the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public Cell getTop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.top;
    }
}