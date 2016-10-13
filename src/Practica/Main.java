package Practica;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by jmunarb on 06/10/16.
 */
public class Main {
    static String resposta = "";
    static Scanner sc = new Scanner(System.in);
    static Figura figura;

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
            cridarFinestra();

        } else if(resposta.equals("B")){



        } else if(resposta.equals("C")){


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
