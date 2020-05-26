import java.awt.Graphics;
import javax.swing.JComponent;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.Color;

public class DComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        int maxValue = 7;

        int r = ThreadLocalRandom.current().nextInt(0,maxValue+1);

        
        
        while(r>0){
            g.setColor(Color.BLUE);
            int x = ThreadLocalRandom.current().nextInt(0,800+1);
            int y = ThreadLocalRandom.current().nextInt(0,800+1);
                        g.fillRect(x,y,100,50);
            r--;

        }

        //draw ovals
        int o = ThreadLocalRandom.current().nextInt(0,maxValue+1);

        while(o>0){
            g.setColor(Color.RED);
            int a = ThreadLocalRandom.current().nextInt(0,800+1);
            int b = ThreadLocalRandom.current().nextInt(0,800+1);
            g.fillOval(a,b,150,75);
            o--;
        }

        //draw lines
        int l = ThreadLocalRandom.current().nextInt(0,maxValue+1);

        while(l>0){
            g.setColor(Color.BLACK);
            int m = ThreadLocalRandom.current().nextInt(0,800+1);
            int n = ThreadLocalRandom.current().nextInt(0,800+1);
            int p = ThreadLocalRandom.current().nextInt(0,800+1);
            int q = ThreadLocalRandom.current().nextInt(0,800+1);
            g.drawLine(m,n,p,q);
            l--;

        }
    }
    public void refresh()
    {
        repaint();
    }

}