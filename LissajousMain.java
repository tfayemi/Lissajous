/**
 * 
 * @author Toluwa Fayemi
 * 2020
 */
import javax.swing.JFrame;

public class LissajousMain 
{
    public static void main(String[] args) 
    {

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Lissajous(500));
        frame.pack();
        frame.setVisible(true);
    }
}