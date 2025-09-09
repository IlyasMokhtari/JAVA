package queue;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;


public class TestQueue {

    @Test
    public void testEnqueue() {
        Queue queue = new Queue();
        Cell cell= new Cell(2,null);
        queue.enqueue(cell.getValue());
        assertEquals(2,queue.getHead().getValue());
        assertEquals(2,queue.getTail().getValue());
        Cell cell2= new Cell(1,null);
        queue.enqueue(cell2.getValue());
        assertEquals(2,queue.getHead().getValue());
        assertEquals(1,queue.getTail().getValue());

    }

    @Test
    public void testDequeueWhenNotEmpty(){
        Queue queue = new Queue();
        Cell cell= new Cell(2,null);
        queue.enqueue(cell.getValue());
        assertEquals(2,queue.dequeue());
        
    }

    @Test
    public void testDequeueWhenEmpty(){
        Queue queue = new Queue();
        assertThrows(NoSuchElementException.class, () -> {queue.dequeue();});
        
    }

    @Test
    public void testGetHead(){
        Queue queue = new Queue();
        Cell cell = new Cell(2,null);
        Cell cell2 = new Cell(1,null);
        queue.enqueue(cell.getValue());
        queue.enqueue(cell2.getValue());
        assertEquals(2,queue.getHead().getValue());
    }

    @Test
    public void testGetHeadWhenEmpty(){
        Queue queue = new Queue();
        assertThrows(NoSuchElementException.class, () -> {queue.getHead();});
    }

    @Test
    public void testGetTail(){
        Queue queue = new Queue();
        Cell cell = new Cell(2,null);
        Cell cell2 = new Cell(1,null);
        queue.enqueue(cell.getValue());
        queue.enqueue(cell2.getValue());
        assertEquals(1,queue.getTail().getValue());
    }

    @Test
    public void testGetTailWhenEmpty(){
        Queue queue = new Queue();
        assertThrows(NoSuchElementException.class, () -> {queue.getTail();});
    }

    @Test
    public void testIsEmptyWhenTrue(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmptyWhenFalse(){
        Queue queue = new Queue();
        Cell cell = new Cell(2,null);
        queue.enqueue(cell.getValue());
        assertFalse(queue.isEmpty());
    }




}
