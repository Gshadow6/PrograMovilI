import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboWombo extends JFrame {
    JComboBox<String> comboBox;
    DrawingPanel drawingPanel;
    
    public ComboWombo() {
        setTitle("Paint");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        comboBox = new JComboBox<>(new String[] { "Rojo", "Verde", "Azul" });
        drawingPanel = new DrawingPanel(comboBox);
        
        comboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                drawingPanel.cambiarColor();
            }
        });

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(comboBox, BorderLayout.NORTH);
        c.add(drawingPanel, BorderLayout.CENTER);
    }

    
}

