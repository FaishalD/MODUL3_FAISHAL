import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    boolean repeat = true;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Calculation cal = new Calculation();
        Thread th = new Thread(cal);

        do {
            try{
                System.out.println("Daftar Bangun 2 Dimensi");
                System.out.println("1. Square");
                System.out.println("2. Circle");
                System.out.println("3. Trapezoid");
                System.out.println("0. Exit");
                System.out.println("Pilih Rumus yang Akan Digunakan:");

                int input = scan.nextInt();
                switch (input) {
                    case 1:
                        System.out.print("Masukan Sisi Persegi: ");
                        double side = scan.nextDouble();
                        cal.setSquare(side);
                        break;
                    case 2:
                        System.out.print("Masukan radius Lingkaran: ");
                        double radius = scan.nextDouble();
                        cal.setSquare(radius);
                        break;
                    case 3:
                        System.out.print("Masukkan sisi atas Trapesium: ");
                        double a = scan.nextDouble();
                        System.out.print("Masukkan sisi bawah Trapesium: ");
                        double b = scan.nextDouble();
                        System.out.print("Masukkan tinggi Trapesium: ");
                        double t = scan.nextDouble();
                        cal.setTrapezoid(a, b, t);
                        break;
                }
            }
        }
    }
}
