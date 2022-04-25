import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class Arena extends JPanel{

    public Arena(){
        isFocusable();
        setFocusable(true);
        addKeyListener(new MyKeyListener());
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        try{
            Thread.sleep(10);
        }
        catch(Exception e){

        }

        repaint();
    }

    public class MyKeyListener extends KeyAdapter{
        // overriding this method from KeyAdapter
        public void keyPressed(KeyEvent e){
            System.out.println(e.getKeyCode());
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_KP_UP){
                
            }
            if(key == KeyEvent.VK_KP_DOWN){
                
            }
        }
    }
}