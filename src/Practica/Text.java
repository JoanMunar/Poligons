package Practica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Text extends JFrame {
    private String resposta = "";
    private int posx;
    private int posy;
    private Color nomColor;
    private JPanel contentPane;

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public void setPosx(int posx) {

        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public void setColor(Color nomColor) {
        this.nomColor = nomColor;
    }

    public Text() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 30, 50, 30);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        setBounds(0,0,800,600);
    }

    public void paint (Graphics g){

        super.paint(g);
        g.setColor(nomColor);
        g.drawString(resposta, posx, posy);
    }

}