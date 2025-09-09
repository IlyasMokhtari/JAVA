package stack;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class StackFrame extends JFrame {

    private JButton btnPush = new JButton("Push");
    private JButton btnPull = new JButton("Pull");
    private StackPanel stackPanel;
    private JTextField txtNewValue = new JTextField(5);

    public StackFrame() {
        super("My Stack");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // l'operation s'arrête au moment où on ferme la page
        this.setSize(600, 400);
        this.setLocationRelativeTo(null); //centre la page sur l'ecran

        stackPanel = new StackPanel();
        this.add(stackPanel);

        this.add(createToolBar(), BorderLayout.NORTH); // ajoute une  toolBar
    }

    private JToolBar createToolBar() {
        JToolBar toolBar = new JToolBar();

        btnPush.addActionListener(e -> {
            try {
                int value = Integer.parseInt(txtNewValue.getText()); // transforme la chaine en Int
                stackPanel.addSquare(value);// ajoute la carré avec la valaur value
                txtNewValue.setText(""); //la valeur ecrite est ""
            } 
            catch (NumberFormatException ex) {
                System.out.println("Entrez un nombre valide !");
            }
        });

        btnPull.addActionListener(e -> {
            stackPanel.removeSquare();
        });

        toolBar.add(btnPush);
        toolBar.add(btnPull);
        toolBar.add(txtNewValue);

        return toolBar;
    }

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel()); // ajoute un style Nimbus
        StackFrame queueFrame = new StackFrame();
        queueFrame.setVisible(true); // affiche les carrés
    }
}
