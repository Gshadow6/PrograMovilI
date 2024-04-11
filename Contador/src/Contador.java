import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contador extends JFrame implements Runnable, ActionListener{
    JLabel num;
    int i;
    boolean contar;
    Thread hilo;
    JButton btnIniciar, btnDetener;

    public Contador() {
        setSize(200, 200);
        setTitle("Contador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
        num = new JLabel(i + "");
        add(num);
        hilo = new Thread(this);
        btnIniciar= new JButton("Iniciar");
        btnDetener= new JButton("Detener");
        btnIniciar.addActionListener(this);
        btnDetener.addActionListener(this);
        add(btnIniciar);
        add(btnDetener);
    }

    public static void main(String[] args) {
        Contador c = new Contador();
        c.setVisible(true);
        
        
    }

    @Override
    public void run() {
        while(contar){
            try{
                num.setText(i+" ");
                i = i+1;
                Thread.sleep(500);
            }catch(Exception ex){
                System.out.println("Hilo Fallido");
            }
        }
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnIniciar)) {
            contar = true;
            hilo.start();
        }
        if (e.getSource().equals(btnDetener)) {
            contar = false;
            System.out.println("Contador detenido");
        }
    }

    
}