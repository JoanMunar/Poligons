package Practica;

public class Poligon extends Figura{
    private int[] num_puntes;

    private boolean relleno;



    public boolean isRelleno() {
        return relleno;
    }

    @Override
    void llegir() {
        super.llegir();

        System.out.print("Numero de puntes --> ");

        System.out.println("Relleno? S/n");
        relleno = sc.next().equals("S");

    }
}
