package stack;

/**
 * A class representing a single cell (node) in a Stack.
 */
public class Cell {

    /**
     * The integer value stored in this cell.
     */
    private int value;

    /**
     * The previous cell in the stack.
     */
    private final Cell prev;

    /**
     * Constructs a new Cell with the given value and reference to the previous cell.
     *
     * @param value the integer value to store in this cell
     * @param prev  the previous cell in the stack (can be null if this is the bottom cell)
     */
    public Cell(int value, Cell prev) {
        this.value = value;
        this.prev = prev;
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
     * Returns the previous cell in the stack.
     *
     * @return the previous Cell object, or null if this is the bottom cell
     */
    public Cell getPrev() {
        return this.prev;
    }
}
