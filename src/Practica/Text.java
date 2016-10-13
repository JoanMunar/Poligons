package Practica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Text extends JFrame {

    private String resposta = "";
    private int posx;
    private int posy;
    private Color nomColor;
    private JPanel contentPane;

    public Text(){

        Scanner sc = new Scanner(System.in);

        resposta = "";

        System.out.println("Introdueix el text que vols imprimir:");

        resposta = sc.nextLine();

        atColor ac = new atColor();
        nomColor = ac.color;

        System.out.println("A quina posició X ha de estar?");

        posx = sc.nextInt();

        System.out.println("I la Y?");

        posy = sc.nextInt();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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