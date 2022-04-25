import javax.swing.*;
import java.awt.*;
public class Frame{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        Arena panel = new Arena();
        frame.add(panel);
        frame.setSize(1000,1000);
        frame.setVisible(true);
    }
}