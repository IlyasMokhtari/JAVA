package stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCell {

    @Test
    public void testGetValue() {
        Cell cell = new Cell(2,null);
        assertEquals(2, cell.getValue());
    }

    @Test
    public void testGetPrevWhenNull() {
        Cell cell = new Cell(2,null);
        assertEquals(null, cell.getPrev());
    }

    @Test
    public void testGetPrevWhenNotNull(){
        Cell cell1 = new Cell(2,null);
        Cell cell2 = new Cell(3,cell1);
        assertEquals(cell1,cell2.getPrev());
    }

}


