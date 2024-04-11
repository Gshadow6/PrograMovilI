import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Capitales2 extends JFrame implements ActionListener{
    String [] estados = {"Sonora", "EdoMex", "Ciudad de México", "Guadalajara", "Monterrey"};
    String [] capitales = {"Hermosillo", "Toluca", "CDMX", "Jalisco", "NuevoLeon"};
    JComboBox<String> estado;
    JLabel capital;
    JPanel p;
    
    public Capitales2(){
        setTitle("Estados y Capitales"); setSize(300,100);
        setDefaultCloseOperation(3);

        estado = new JComboBox<>();
        for(int i =0; i<estados.length; i++){
            estado.addItem(estados[i]);
        }
        estado.addActionListener(this);
        // estado.addItem("Sonora");
        // estado.addItem("EdoMex");
        // estado.addItem("Ciudad de México");
        // estado.addItem("Guadalajara");
        // estado.addItem("Monterrey");

        capital = new JLabel();

        p = new JPanel(new BorderLayout());

        p.add(estado, BorderLayout.NORTH);
        p.add(capital, BorderLayout.SOUTH);
        add (p);
    }
    public static void main(String[] args) {
        Capitales2 c = new Capitales2();
        c.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int estadoSelect = (int) estado.getSelectedIndex();
        capital.setText(capitales[estadoSelect]);
        
    }
}