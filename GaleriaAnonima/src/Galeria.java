import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class Galeria extends JFrame { 
    String[] arregloImg = {"src/img/imagen1.jpg", "src/img/imagen2.jpg", "src/img/imagen3.jpg"};
    int activaImg;
    JPanel pImg, pBtn;
    JButton btnAtras, btnAdelante;

    public Galeria() {
        setTitle("Galeria Anonima");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnAdelante = new JButton("Siguiente");
        btnAtras = new JButton("Anterior");

        btnAdelante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                activaImg = (activaImg + 1) % arregloImg.length;
                pImg.repaint();
            }
        });

        btnAtras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                activaImg = (activaImg - 1 + arregloImg.length) % arregloImg.length;
                pImg.repaint();
            }
        });
        
        pImg = new JPanel() { 
            @Override 
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    BufferedImage i = ImageIO.read(new File(arregloImg[activaImg])); 
                    g.drawImage(i, 0, 0, getWidth(), getHeight(), null); 
                } catch (Exception e) {}
            }
        };
        add(pImg);
        
        pBtn = new JPanel();
        pBtn.add(btnAdelante);
        pBtn.add(btnAtras);
        add(pBtn, BorderLayout.SOUTH);

        
    }

    public static void main(String[] args) throws Exception {
        Galeria ga = new Galeria();
        ga.setVisible(true);  
    }
}