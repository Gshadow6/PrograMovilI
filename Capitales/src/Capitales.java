import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Capitales extends JFrame implements ActionListener{
    HashMap<String, String> edocap;
    JComboBox<String> estado;
    JLabel capital;
    JPanel p;
    
    public Capitales(){
        setTitle("Estados y Capitales"); setSize(300,100);
        setDefaultCloseOperation(3);

        edocap = new HashMap<>();
        edocap.put("Aguascalientes", "Aguascalientes");
        edocap.put("Baja California", "Mexicali");
        edocap.put("Baja California Sur", "La Paz");
        edocap.put("Campeche", "Campeche");
        edocap.put("Chiapas", "Tuxtla Gutierrez");
        edocap.put("Chihuahua", "Chihuahua");
        edocap.put("Coahuila", "Saltillo");
        edocap.put("Colima", "Colima");
        edocap.put("Durango", "Durango");
        edocap.put("Guanajuato", "Guanajuato");
        edocap.put("Guerrero", "Chilpancingo");
        edocap.put("Hidalgo", "Pachuca");
        edocap.put("Jalisco", "Guadalajara");
        edocap.put("Mexico", "Toluca");
        edocap.put("Michoacan", "Morelia");
        edocap.put("Morelos", "Cuernavaca");
        edocap.put("Nayarit", "Tepic");
        edocap.put("Nuevo Leon", "Monterrey");
        edocap.put("Oaxaca", "Oaxaca");
        edocap.put("Puebla", "Puebla");
        edocap.put("Queretaro", "Queretaro");
        edocap.put("Quintana Roo", "Chetumal");
        edocap.put("San Luis Potosi", "San Luis Potosi");
        edocap.put("Sinaloa", "Culiacan");
        edocap.put("Sonora", "Hermosillo");
        edocap.put("Tabasco", "Villahermosa");
        edocap.put("Tamaulipas", "Ciudad Victoria");
        edocap.put("Tlaxcala", "Tlaxcala");
        edocap.put("Veracruz", "Xalapa");
        edocap.put("Yucatan", "Merida");
        edocap.put("Zacatecas", "Zacatecas");

        estado = new JComboBox<>();
        for(String e : edocap.keySet()){
            estado.addItem(e);
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
        Capitales c = new Capitales();
        c.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String estadoSelect = (String) estado.getSelectedItem();
        capital.setText(edocap.get(estadoSelect));
        
    }
}