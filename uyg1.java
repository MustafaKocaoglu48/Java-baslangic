package appletgece;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class uyg1 extends JPanel{
    public void paint(Graphics g){
        g.drawLine(15, 10, 250, 10);
        g.drawString("ilhan", 15, 25);
        g.drawLine(15, 30, 250, 30);
        g.drawString("AYDIN", 15, 45);
        g.drawLine(15, 50, 250, 50);    }
    public static void main(String[] args) {
        uyg1 u1=new uyg1();
        JFrame f=new JFrame();
        f.add(u1);f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
    }
}
