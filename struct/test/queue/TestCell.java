package queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCell {

    @Test
    public void testGetValue() {
        Cell cell = new Cell(2,null);
        assertEquals(2, cell.getValue());
    }

    @Test
    public void testSetValue() {
        Cell cell = new Cell(2,null);
        cell.setValue(10);
        assertEquals(10, cell.getValue());
    }

    @Test
    public void testGetNextWhenNull() {
        Cell cell = new Cell(2,null);
        assertEquals(null, cell.getNext());
    }

    @Test
    public void testGetNextWhenNotNull(){
        Cell cell2 = new Cell(2,null);
        Cell cell1 = new Cell(3,cell2);
        assertEquals(cell2,cell1.getNext());
    }

}


