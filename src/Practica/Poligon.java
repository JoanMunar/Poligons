package Practica;

public class Poligon extends Figura{
    private int num_costats;
    private int[] coordX;
    private int[] coordY;
    private boolean relleno;



    public boolean isRelleno() {
        return relleno;
    }

    @Override
    void llegir() {
        super.llegir();

        System.out.print("Numero de costats --> ");
        num_costats = sc.nextInt();

        coordX = new int[num_costats + 1];
        coordY = new int[num_costats + 1];


        for (int i = 0; i < coordX.length; i++) {

            System.out.println("Coordenades de X -->");



            System.out.println("Coordenades de Y -->");



        }

        System.out.println("Relleno? S/n");
        relleno = sc.next().equals("S");

    }
}
