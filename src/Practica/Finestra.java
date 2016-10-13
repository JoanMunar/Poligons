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
        } else if(Main.figura instanceof  Linia){

            Linia l = (Linia) Main.figura;

            g.drawLine(l.getPosX(), l.getPosY(), l.getPosX_final(), l.getPosY_final());

        } else if(Main.figura instanceof Cuadrat){

            Cuadrat c = (Cuadrat) Main.figura;

            if(c.isRelleno()){

                g.fillRect(c.getPosX(), c.getPosY(), c.getCostat(), c.getCostat());

            }else{

                g.drawRect(c.getPosX(),c.getPosY(),c.getCostat(),c.getCostat());

            }

        } else if(Main.figura instanceof Punt){

            Punt p = (Punt) Main.figura;

            g.drawString(p.getPunt(),p.getPosX(),p.getPosY());

        }


    }
}
