/* Programa que tiene:
JFrame
	JPanel
		Punto que se mueva con los botones
	JPanel
		4 Botones que mueven el punto: Arriba, abajo, derecha e izquierda

*/
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bolita extends Canvas {
    int moverX=180, moverY=100;

    public Bolita() {
        setSize(400, 200);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(moverX, moverY, 30, 30);
    }

    public int getMoverX() {
        return this.moverX;
    }

    public void setMoverX(int moverX) {
        this.moverX = moverX;
    }

    public int getMoverY() {
        return this.moverY;
    }

    public void setMoverY(int moverY) {
        this.moverY = moverY;
    }

    public class Control extends JPanel implements ActionListener {
        JButton btnArriba, btnAbajo, btnIzquierda, btnDerecha;
        Bolita bolita;

        public Control(Bolita b) {
            btnArriba = new JButton("Arriba");
            btnAbajo = new JButton("Abajo");
            btnIzquierda = new JButton("Izquierda");
            btnDerecha = new JButton("Derecha");

            bolita = b;

            btnArriba.addActionListener(this);
            btnAbajo.addActionListener(this);
            btnIzquierda.addActionListener(this);
            btnDerecha.addActionListener(this);

            setLayout(new BorderLayout());

            add(btnArriba, BorderLayout.NORTH);
            add(btnAbajo, BorderLayout.SOUTH);
            add(btnIzquierda, BorderLayout.WEST);
            add(btnDerecha, BorderLayout.EAST);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(btnIzquierda)) {
                bolita.setMoverX(bolita.getMoverX() - 5);
            }
            if (e.getSource().equals(btnDerecha)) {
                bolita.setMoverX(bolita.getMoverX() + 5);
            }
            if (e.getSource().equals(btnArriba)) {
                bolita.setMoverY(bolita.getMoverY() - 5);
            }
            if (e.getSource().equals(btnAbajo)) {
                bolita.setMoverY(bolita.getMoverY() + 5);
            }
            bolita.repaint();
        }
    }

    public class Controlador extends JFrame {
        JPanel pBolita, pControl;

        public Controlador() {
            setTitle("Mover");
            setSize(400, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);

            Bolita bolita = new Bolita();
            Control control = new Control(bolita);

            add(bolita, BorderLayout.CENTER);
            add(control, BorderLayout.SOUTH);
        }
    }

    public static void main(String[] args) {
        Controlador controlador = new Bolita().new Controlador();
        controlador.setVisible(true);
    }
}