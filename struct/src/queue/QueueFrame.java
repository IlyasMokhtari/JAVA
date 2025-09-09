package queue;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class QueueFrame extends JFrame{

    private JButton btnEnqueue = new JButton("Enqueue");
    private JButton btnDequeue = new JButton("Dequeue");
    private JTextField txtNewValue = new JTextField(5);
    private QueuePanel queuePanel;


    public QueueFrame() {
        super("My Queue");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);

        this.add(createToolBar(), BorderLayout.NORTH);

        queuePanel = new QueuePanel();
        this.add(queuePanel);
    }

    private JToolBar createToolBar(){
        JToolBar toolBar = new JToolBar();
        
        btnEnqueue.addActionListener(e ->{
            try {
                int value= Integer.parseInt(txtNewValue.getText());
                queuePanel.addSquare(value);
                txtNewValue.setText("");

            } 
            catch (NumberFormatException ex) {
                System.out.println("Entrez un nombre valide !");
            }
        });

        btnDequeue.addActionListener(e -> {
            queuePanel.removeSquare();
        });

        

        toolBar.add(btnEnqueue);
        toolBar.add(btnDequeue);
        toolBar.add(txtNewValue);
        return toolBar;
    }

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        QueueFrame queueFrame = new QueueFrame();
        queueFrame.setVisible(true);
    }

    
}
