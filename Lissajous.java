/**
 * @author Toluwa Fayemi
 * 2020
 */

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Lissajous extends JPanel 
{
    JTextField a_text; 
    JTextField b_text; 
    JTextField del_text;
    
    double a = 0;
    double b = 0; 
    double delta = 0;
    int size;
    
    public Lissajous(int size) {

        setPreferredSize(new Dimension(size, size));
        this.size = size;
        a_text = new JTextField(5);
        a_text.setText("2");
        b_text = new JTextField(5);
        b_text.setText("3");
        del_text = new JTextField(5);
        del_text.setText("0.5");
        setLayout(new FlowLayout());
        setBackground(Color.WHITE);
        
        add(new JLabel("a: "));
        add(a_text);
        add(new JLabel("b: "));
        add(b_text);
        add(new JLabel("delta: "));
        add(del_text);
        a_text.addActionListener(new ActionListener() 
            {

                @Override
                public void actionPerformed(ActionEvent arg0) {

                    repaint();
                }
            }
        );

        b_text.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent arg0) {

                    repaint();
                }
            }
        );

        del_text.addActionListener(new ActionListener() 
            {
                @Override

                public void actionPerformed(ActionEvent arg0) {

                    repaint();
                }
            }
        );

    }

    @Override

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        try {
            a = Double.parseDouble(a_text.getText());
            b = Double.parseDouble(b_text.getText());
            delta = Double.parseDouble(del_text.getText());
        } catch (Exception e) {
        }

        double currentX = size / 2 + 2 * size / 5 * Math.sin(delta);
        double currentY = size / 2 + 2 * size / 5 * Math.cos(0);

        for (double t = 0; t <= (a + b) * Math.PI; t += 0.001) {
            double newX = size / 2 + 2 * size / 5 * Math.sin(a * t + delta);
            double newY = size / 2 + 2 * size / 5 * Math.cos(b * t);

            int x1 = (int) currentX;
            int y1 = (int) currentY;
            int x2 = (int) newX;
            int y2 = (int) newY;

            g.drawLine(x1, y1, x2, y2);

            currentX = newX;
            currentY = newY;
        }
    }
}