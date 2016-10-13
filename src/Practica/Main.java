package Practica;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * Created by jmunarb on 06/10/16.
 */
public class Main {
    static String resposta = "";
    static Scanner sc = new Scanner(System.in);
    static Figura figura;
    static List<Figura> hist = new ArrayList<Figura>();

    public static void main(String[] args) {

            menu();
    }

    public static void menu(){

        System.out.println("Quina figura vols dibuixar? (escull una lletra)\n" +
                "A. Text\n" +
                "B. Punt\n" +
                "C. Línia\n" +
                "D. Cercle\n" +
                "E. Quadrat\n" +
                "F. Rectangle\n" +
                "G. Polígon\n" +
                "H. Dibuixar l’històric de figures.\n" +
                "I. Sortir\n" +
                "\n" +
                "Resposta:");

        resposta = sc.nextLine();

        if(resposta.equals("A")) {

            figura = new Text();
            figura.llegir();
            hist.add(figura);
            cridarFinestra();


        } else if(resposta.equals("B")){

            figura = new Punt();
            figura.llegir();
            hist.add(figura);
            cridarFinestra();

        } else if(resposta.equals("C")){

            figura = new Linia();
            figura.llegir();
            hist.add(figura);
            cridarFinestra();

        } else if(resposta.equals("D")) {

            figura = new Cercle();
            figura.llegir();
            hist.add(figura);
            cridarFinestra();

        } else if(resposta.equals("E")){

            figura = new Cuadrat();
            figura.llegir();
            hist.add(figura);
            cridarFinestra();

        } else if(resposta.equals("F")){


        } else if(resposta.equals("G")){


        }else if(resposta.equals("H")){

            cridarFinestra();

        }else if(resposta.equals("I")){

            return;
        }

        menu();

    }

    public static void  cridarFinestra(){

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {
                    Finestra frame = new Finestra();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

    }

}
