package appletgece;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class uyg6 extends JPanel {
    public void paint(Graphics g){
      g.drawOval(100, 100, 80, 40);
      g.drawLine(100, 120, 100, 220);
      g.drawOval(100, 200, 80, 40);
      g.drawLine(180, 120, 180, 220);}
    public static void main(String[] args) {
        uyg6 u6=new uyg6();
        JFrame f=new JFrame();
        f.add(u6);f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
    }
}
