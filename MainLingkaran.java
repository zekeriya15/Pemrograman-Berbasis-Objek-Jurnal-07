import java.util.Scanner;

public class MainLingkaran {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        

        int choice = 0;

        do { 
            System.out.println("\nPilihan:\n1. Hitung luas & keliling lingkaran\n2. Keluar");
            System.out.print("Masukkan pilihan: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    userInput();
                break;
                case 2:
                    System.out.println("Keluar aplikasi");
                break;
                default:
                    System.out.println("Invalid input, coba lagi");
                break;
            }

        } while (choice != 2);

    }

    private static void userInput() {
        System.out.println("\nPilih:\n1. Masukkan jari-jari lingkaran\n2. Masukkan diameter lingkaran");
        System.out.print("Pilih: ");
        int choice = s.nextInt();

        if (choice == 1) {
            System.out.print("Masukkan jari-jari: ");
            float r = s.nextFloat();

            System.out.printf("Luas lingkaran: %.2f\n", Lingkaran.getLuas(r));
            System.out.printf("Keliling lingakaran: %.2f\n", Lingkaran.getKeliling(r));
        } else if (choice == 2) {
            System.out.print("Masukkan diameter: ");
            double diameter = s.nextDouble();
            
            System.out.printf("Luas lingakaran: %.2f\n", Lingkaran.getLuas(diameter));
            System.out.printf("Keliling lingakaran: %.2f\n", Lingkaran.getKeliling(diameter));

        } else {
            System.out.println("invalid input");
        }


    }
}
