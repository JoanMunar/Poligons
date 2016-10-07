package Practica;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by jmunarb on 06/10/16.
 */
public class Main {
    static String resposta;
    static int posx;
    static int posy;
    static Scanner sc = new Scanner(System.in);
    static String nomColor;

    public static void main(String[] args) {

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

        resposta = sc.next();

        if(resposta.equals("A")) {

            RespostaA();

        }

    }

    public static void RespostaA(){

        resposta = "";

        System.out.println("Introdueix el text que vols imprimir:");

        resposta = sc.next();

        System.out.println("De quin nomColor ha de ser el text impres?\n" +
                "A. Cian\n" +
                "B. Negre\n" +
                "C. Vermell\n" +
                "D. Blau\n" +
                "E. Groc\n" +
                "F. Taronja\n" +
                "G. Magenta\n" +
                "I. Verd");

        nomColor = sc.next();

        System.out.println("A quina posició X ha de estar?");

        posx = sc.nextInt();

        System.out.println("I la Y?");

        posy = sc.nextInt();

        EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    Text frame = new Text();
                    frame.setResposta(resposta);
                    frame.setColor(GetColor(nomColor));
                    frame.setPosx(posx);
                    frame.setPosy(posy);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });


    }

    public static Color GetColor(String nomColor){

        if(nomColor == "A"){

            return Color.cyan;

        } else if( nomColor == "B"){

            return Color.black;

        }else if( nomColor == "C"){

            return Color.red;

        }else if( nomColor == "D"){

            return Color.blue;

        }else if( nomColor == "E"){

            return Color.yellow;

        }else if( nomColor == "F"){

            return Color.orange;

        }else if( nomColor == "G"){

            return Color.magenta;

        }else if( nomColor == "H"){

            return Color.green;

        } else {

            return Color.black;

        }

    }
}
