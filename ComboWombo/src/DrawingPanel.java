import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class DrawingPanel extends JPanel {
    JComboBox<String> comboBox;
    int lastX, lastY;
    Color currentColor = Color.BLACK;

    public DrawingPanel(JComboBox<String> comboBox) {
        this.comboBox = comboBox;
        
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();
                int x = e.getX();
                int y = e.getY();
                g.setColor(currentColor);
                g.drawLine(lastX, lastY, x, y);
                lastX = x;
                lastY = y;
            }
        });
    }

    public void cambiarColor() {
        String color = (String) comboBox.getSelectedItem();
        switch (color) {
            case "Rojo":
                currentColor = Color.RED;
                break;
            case "Verde":
                currentColor = Color.GREEN;
                break;
            case "Azul":
                currentColor = Color.BLUE;
                break;
        }
    }
}
