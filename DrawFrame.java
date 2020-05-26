/** File HelloFrame.java */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class DrawFrame extends JFrame
{   

   private ActionListener listener;
      
    private JButton button;
    private DComponent d;
    
   private static int FRAME_WIDTH = 900;
   private static int FRAME_HEIGHT = 900;


    
   public DrawFrame()
   {
      d = new DComponent();
      d.setVisible(false);
      add(d, BorderLayout.CENTER);
      
       createButton();
       add(button,BorderLayout.NORTH);
       
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }
    private void createButton(){
        

        button = new JButton("DRAW");
        button.setVisible(true);;
        
        class DrawListener implements ActionListener {
            public void actionPerformed(ActionEvent event){
                d.setVisible(true);
                 d.repaint();
            }
        }
        listener = new DrawListener();
        button.addActionListener(listener);
    }
   
}
