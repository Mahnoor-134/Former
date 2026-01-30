/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package former;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author okama01
 */
public abstract class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//för att hämta värde från tangentbordet
        ArrayList<Form> formLista = new ArrayList<>();

        int val;

        do {
            System.out.println("");
            System.out.println("Meny");
            System.out.println("1.Skriv ut listan ");
            System.out.println("2.Rektangel");
            System.out.println("3.Triangel");
            System.out.println("4.Cirkel");
            System.out.println("0.Avsluta");
            val = input.nextInt();

            switch (val) {
                case 1:
                    skrivUt(formLista);
                    break;

                case 2:
                    System.out.println("Rektangel:");
                    System.out.println("Ange x-koordinate:  ");
                    int x = input.nextInt();
                    System.out.println("Ange y-koordinate:  ");
                    int y = input.nextInt();
                    System.out.println("Ange basen: ");
                    int base = input.nextInt();
                    System.out.println("Ange höjden:  ");
                    int höjd = input.nextInt();
                    Form r = new Rektangel(x, y, base, höjd, true);
                    formLista.add(r);

                    break;

                case 3:
                    System.out.println("Triangel: ");
                    System.out.println("Ange x-koordinate:  ");
                    int X = input.nextInt();
                    System.out.println("Ange y-koordinate:  ");
                    int Y = input.nextInt();
                    System.out.println("Ange basen: ");
                    int B = input.nextInt();
                    System.out.println("Ange höjden:  ");
                    int H = input.nextInt();
                    Form t = new Triangle(X, Y, B, H, true);
                    formLista.add(t);
                    break;

                case 4:
                    System.out.println("Cirkel: ");
                    System.out.println("Ange x-koordinate:  ");
                    int Kx = input.nextInt();
                    System.out.println("Ange y-koordinate:  ");
                    int Ky = input.nextInt();
                    System.out.println("Ange radie: ");
                    int R = input.nextInt();
                    Form c = new Cirkel(Kx, Ky, R, true);
                    formLista.add(c);
                    break;

                case 0:
                    System.out.println("");
                    break;

                default:
                    System.out.println("Ogiltig val");
                    break;

            }

        } while (val != 0);
    }

    /*   public static int information(ArrayList formLista, Scanner input) {
        System.out.println("Rektangel:");
        System.out.println("Ange x-koordinate:  ");
        int x = input.nextInt();
        System.out.println("Ange y-koordinate:  ");
        int y = input.nextInt();
        System.out.println("Ange basen: ");
        int base = input.nextInt();
        System.out.println("Ange höjden:  ");
        int höjd = input.nextInt();
            Form f = new Form(x, y, base, höjd);
        formLista.add(f);

        //return antalkontakt;

        return 0;
    }
     */
    public static void skrivUt(ArrayList<Form> formLista) {
        if ( formLista.isEmpty() ) {
            System.out.println("Listan är tom");
        } else {
            for (int i = 0; i < formLista.size(); i++) {
                System.out.println(formLista.get(i).whatAmI() + " Area: " + formLista.get(i).getArea());
            }
        }
    }
}

/*Cirkel c = new Cirkel(12, 34, 6, true);
        System.out.println("Area: " + c.getArea());
        
        Triangle t = new Triangle(9, 2, 9, 6, false);
        System.out.println("Area: " + t.getArea());
        
        Rektangel r = new Rektangel(1, 2, 3, 4, true);
        System.out.println("Area: " + r.getArea());
 */
