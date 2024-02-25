import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String Nama = scanner.nextLine();

        System.out.print("Jenis Kelamin L atau P: ");
        String Gender = scanner.next().equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan";

        System.out.print("Tanggal Lahir (tahun-bulan-hari): ");
        LocalDate TanggalLahir = LocalDate.parse(scanner.next());

        Period umur = Period.between(TanggalLahir, LocalDate.now());

        System.out.println("\nOutput:");
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis Kelamin: " + Gender);
        System.out.println("Umur: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan");
    }
}