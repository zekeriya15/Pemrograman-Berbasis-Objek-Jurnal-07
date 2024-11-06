import java.util.Scanner;

public class MainSegitiga {
    private static Scanner s = new Scanner(System.in);
     
    public static void main(String[] args) {
        int choice = 0;

        do { 
            System.out.println("\nHitung luas dan keliling segitiga sama sisi");
            System.out.println("Pilih:" +
                                "\n1. Masukkan alas dan tinggi" + 
                                "\n2. Masukkan alas dan sisi" +
                                "\n0. Keluar");
            System.out.print("Pilih: ");
            choice = s.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Masukkan alas: ");
                    double alas = s.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = s.nextDouble();

                    Segitiga triangle = new Segitiga(alas, tinggi);
                    displayData(triangle);
                break;
                case 2:
                    // System.out.print("Masukkan alas: ");
                    // alas = s.nextDouble();
                    System.out.print("Masukkan sisi: ");
                    double sisi = s.nextDouble();

                    triangle = new Segitiga(sisi);
                    displayData(triangle);
                break;
            }
            
        } while (choice != 0);
    }

    private static void displayData(Segitiga triangle) {
        System.out.println("\nAlas segitiga: " + triangle.getAlas() + " cm");
        System.out.printf("Tinggi segitiga: %.2f cm\n", triangle.getTinggi());
        System.out.printf("Sisi segitiga: %.2f cm\n", triangle.getSisi());
        System.out.printf("Luas segitiga sama sisi: %.2f cm^2\n", triangle.getLuas());
        System.out.printf("Keliling segitiga sama sisi: %.2f cm\n", triangle.getKeliling());
    }

}
