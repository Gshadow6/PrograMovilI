import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GaleriaImagenes extends JFrame implements ActionListener{
    JButton btnAtras,btnAdelante;
    JPanel pbtn;
    PintarImagen pimg;

    public GaleriaImagenes(){
        setTitle("Galeria Imagenes");setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pimg = new PintarImagen();
        add(pimg);
        btnAtras = new JButton("Anterior");
        btnAdelante = new JButton("Siguiente");

        btnAtras.addActionListener(this);
        btnAdelante.addActionListener(this);

        pbtn.add(btnAtras);
        pbtn.add(btnAdelante);

        add(pbtn, BorderLayout.SOUTH);


    }
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(btnAdelante)){
            PintarImagen.actualImg = (PintarImagen.actualImg + 1)% PintarImagen.arregloImg.length;
        }
        
        if(e.getSource().equals(btnAtras)){
            PintarImagen.actualImg = (PintarImagen.actualImg - 1 + PintarImagen.arregloImg.length)% PintarImagen.arregloImg.length;
        }
        
        pimg.repaint();
    }
}
