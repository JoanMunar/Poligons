package Practica;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by jmunarb on 06/10/16.
 */
public class Main {
    static String resposta = "";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

            menu();

            resposta = sc.nextLine();

            if(resposta.equals("A")) {

                respostaA();

            } else if(resposta.equals("B")){

                respostaB();

            } else if(resposta.equals("C")){

                respostaC();

            }

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


    }

    public static void  respostaA(){

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {
                    Text frame = new Text();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

    }

    public static void respostaB(){

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {
                    Punt frame = new Punt();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

    }


    public static void respostaC(){

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {
                    Linia frame = new Linia();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

    }

}
