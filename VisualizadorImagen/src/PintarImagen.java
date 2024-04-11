import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PintarImagen extends JPanel{
    static String[] arregloImg = {"src/imagen01", "src/imagen02", "src/imagen03"};
    static int actualImg;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        try{
            BufferedImage i = ImageIO.read(new File(arregloImg[actualImg]));
            g.drawImage(i, 0, 0, getWidth(), getHeight(), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}