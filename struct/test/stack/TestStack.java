package stack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.Test;


public class TestStack {

    @Test
    public void testPush() {
        Stack stack = new Stack();
        Cell cell= new Cell(2,null);
        stack.push(cell.getValue());
        assertEquals(2,stack.getTop().getValue());
    }

    @Test
    public void testPopWhenEmpty(){
        Stack stack = new Stack();
        assertThrows(EmptyStackException.class, () -> {stack.pop();});
        
    }

    @Test
    public void testPopWhenNotEmpty(){
        Stack stack = new Stack();
        Cell cell = new Cell(2,null);
        stack.push(cell.getValue());
        assertEquals(2,stack.pop());
    }

    @Test
    public void testisEmptyWhenTrue(){
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testisEmptyWhenFalse(){
        Stack stack = new Stack();
        Cell cell = new Cell(2,null);
        stack.push(cell.getValue());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void getTop() {
        Stack stack = new Stack();
        Cell cell = new Cell(2,null);
        stack.push(cell.getValue());
        assertEquals(2,stack.getTop().getValue());
    }

    @Test
    public void getTopWhenEmpty() {
        Stack stack = new Stack();
        assertThrows(EmptyStackException.class, () -> {stack.getTop();});
    }




}
