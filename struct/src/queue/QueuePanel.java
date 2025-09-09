package queue;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class QueuePanel extends JPanel{

    private int size = 50;  
    private Color color = Color.LIGHT_GRAY;
    private List<Integer> stack = new ArrayList<>();

    public void addSquare(int value) {
        this.stack.add(value);
        repaint();
    }

    public void removeSquare() {
        if (!stack.isEmpty()) {
            stack.remove(0);
            repaint();
        }
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int panelWidth= this.getWidth();
        int panelHeight= this.getHeight();

        for (int i=0; i<stack.size();i++){
            int x=(panelWidth - this.size)-10-i*(this.size+5);
            int y=(panelHeight - this.size) / 2;

            g.setColor(this.color);
            g.fillRect(x,y,this.size,this.size);

            g.setColor(Color.BLACK);
            g.drawRect(x,y,this.size,this.size);
            if (i==stack.size()-1 || i==0){
                g.drawString(String.valueOf(stack.get(i)),x+20,y+30);
            }
            
            
        }

    }
}
