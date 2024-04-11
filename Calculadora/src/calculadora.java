import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora extends JFrame implements ActionListener {
    String temp;
    int op1, op2;
    boolean opSuma, opResta, opMul, opDiv;
    JPanel panelPrincipal, panelBotones;
    JTextField pantalla;
    JButton[] botones;
    String[] etiquetas = {
        "7", "8", "9", "+",
        "4", "5", "6", "-",
        "1", "2", "3", "*",
        "0", ".", "=", "/"
    };

    public calculadora() {
        setTitle("Calculadora");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        panelPrincipal = new JPanel();
        panelBotones = new JPanel();

        pantalla = new JTextField(20);
        botones = new JButton[16];
        panelBotones.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 16; i++) {
            botones[i] = new JButton(etiquetas[i]);
            panelBotones.add(botones[i]);
            botones[i].addActionListener(this);
        }

        panelPrincipal.add(pantalla);
        add(panelPrincipal);
        add(panelBotones);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(botones[0])) {
            temp = pantalla.getText();
            temp = temp + '7';
            pantalla.setText(temp);
        } else if (e.getSource().equals(botones[1])) {
            temp = pantalla.getText();
            temp = temp + '8';
            pantalla.setText(temp);
        } else if (e.getSource().equals(botones[2])) {
            temp = pantalla.getText();
            temp = temp + '9';
            pantalla.setText(temp);
        } else if (e.getSource().equals(botones[3])) {
            pantalla.setText(pantalla.getText() + "+");
        } else if (e.getSource().equals(botones[4])) {
            temp = pantalla.getText();
            temp = temp + '4';
            pantalla.setText(temp);
        } else if (e.getSource().equals(botones[5])) {
            temp = pantalla.getText();
            temp = temp + '5';
            pantalla.setText(temp);
        } else if (e.getSource().equals(botones[6])) {
            temp = pantalla.getText();
            temp = temp + '6';
            pantalla.setText(temp);
        } else if (e.getSource().equals(botones[7])) {
            pantalla.setText(pantalla.getText() + "-");
        } else if (e.getSource().equals(botones[8])) {
            temp = pantalla.getText();
            temp = temp + '1';
            pantalla.setText(temp);
        } else if (e.getSource().equals(botones[9])) {
            temp = pantalla.getText();
            temp = temp + '2';
            pantalla.setText(temp);
        } else if (e.getSource().equals(botones[10])) {
            temp = pantalla.getText();
            temp = temp + '3';
            pantalla.setText(temp);
        } else if (e.getSource().equals(botones[11])) {
            pantalla.setText(pantalla.getText() + "*");
        } else if (e.getSource().equals(botones[12])) {
            temp = pantalla.getText();
            temp = temp + '0';
            pantalla.setText(temp);
        } else if (e.getSource().equals(botones[13])) {
            temp = pantalla.getText();
            temp = temp + '.';
            pantalla.setText(temp);
        } else if (e.getSource().equals(botones[14])) {
            // Operación "="
            String[] partes = pantalla.getText().split("[-+*/]");
            op1 = Integer.parseInt(partes[0]);
            op2 = Integer.parseInt(partes[1]);
            if (pantalla.getText().contains("+")) {
                pantalla.setText(Integer.toString(op1 + op2));
            } else if (pantalla.getText().contains("-")) {
                pantalla.setText(Integer.toString(op1 - op2));
            } else if (pantalla.getText().contains("*")) {
                pantalla.setText(Integer.toString(op1 * op2));
            } else if (pantalla.getText().contains("/")) {
                pantalla.setText(Integer.toString(op1 / op2));
            }
        } else if (e.getSource().equals(botones[15])) {
            pantalla.setText(pantalla.getText() + "/");
        }
    }

    public static void main(String[] args) {
        calculadora calc = new calculadora();
        calc.setVisible(true);
    }
}  