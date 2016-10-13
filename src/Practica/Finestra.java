package Practica;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Finestra extends JFrame {
    private JPanel contentPane;


    public Finestra() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0,0,800,600);
    }

    public void paint (Graphics g)
    {
        super.paint(g);

        g.setColor(Main.figura.getC().color);

        if(Main.figura instanceof Text) {
            Text t = (Text) Main.figura;

            g.drawString(t.getText() ,t.getPosX(), t.getPosY());
        }


    }
}
