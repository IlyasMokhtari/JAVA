package queue;
/**
 * A class representing a single cell (node) in a queue.
 */
public class Cell {

    /**
     * The integer value stored in this cell.
     */
    private int value;

    /**
     * The next cell in the queue.
     */
    private Cell next;

    /**
     * Constructs a new Cell with the given value and reference to the next cell.
     *
     * @param value the integer value to store in this cell
     * @param next  the next cell in the queue (can be null if this is the last cell)
     */
    public Cell(int value, Cell next) {
        this.value = value;
        this.next = next;
    }

    /**
     * Returns the value stored in this cell.
     *
     * @return the integer value of this cell
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Sets a new value for this cell.
     *
     * @param value the new integer value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Returns the next cell in the queue.
     *
     * @return the next Cell object, or null if this is the last cell
     */
    public Cell getNext() {
        return this.next;
    }

    /**
     * Sets the reference to the next cell in the queue.
     *
     * @param cell the Cell to set as next
     */
    public void setNext(Cell cell) {
        this.next = cell;
    }
}
