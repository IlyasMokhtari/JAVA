package stack;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class StackPanel extends JPanel {

    private int size = 50;  
    private Color color = Color.LIGHT_GRAY;
    private List<Integer> stack = new ArrayList<>();

    public void addSquare(int value) {
        this.stack.add(value);
        repaint();
    }

    public void removeSquare() {
        if (!stack.isEmpty()) {
            stack.remove(stack.size() - 1);
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // appelle la methode sur JPanel ce qui efface le contenu precedent

        int panelWidth = this.getWidth(); //methode pré-définie dans JPanel donc correspond à la largeur du panel
        int panelHeight =this.getHeight(); //methode pré-définie dans JPanel donc correspond à la longueur du panel

        for (int i = 0; i < stack.size(); i++) {
            int x = (panelWidth - this.size) / 2;
            int y = panelHeight - this.size - 10 - i * this.size;

            g.setColor(this.color);
            g.fillRect(x, y, this.size, this.size); //dessine le carré

            g.setColor(Color.BLACK);
            g.drawRect(x, y, this.size, this.size); //dessine les contours

            if (i == stack.size() - 1) {
                g.drawString(String.valueOf(stack.get(i)), x + 20, y + 30); // affiche la avleur du sommet de la pile
            }
        }
    }
}

