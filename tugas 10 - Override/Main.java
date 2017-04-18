import java.util.Scanner;

public class Main {
   public static String warna;
   public static int sisi;

   public static void inputData() {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan warna persegi      : ");
      warna = input.nextLine();
      System.out.print("Masukkan sisi persegi (cm)  : ");
      sisi = input.nextInt();
   }

   public static void main(String[] args) {
      inputData();
      // //panggil constructor dengan parameter
      // Persegi persegi1 = new Persegi(warna, sisi);
      // //panggil constructor tanpa parameter
      // Persegi persegi2 = new Persegi();
      Kubus kubus1 = new Kubus(warna, sisi);
      System.out.println("\n----------------------------------");
      kubus1.tampilWarna();
      kubus1.hitungKeliling();
      kubus1.hitungLuas();
      kubus1.hitungVolume();

      // persegi1.tampilWarna();
      // persegi1.hitungKeliling();
      // persegi1.hitungLuas();
      //
      // System.out.println();
      // System.out.println("-------------------------");
      // //warna dan sisi sudah diberikan
      // persegi2.tampilWarna();
      // persegi2.hitungKeliling();
      // persegi2.hitungLuas();
   }
}