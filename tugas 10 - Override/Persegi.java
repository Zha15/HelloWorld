public class Persegi {
   //attribute
   public String warna;
   public int sisi, keliling, luas;

   //constructor
   Persegi(String warna, int sisi) {
      this.warna = warna;
      this.sisi = sisi;
   }

   Persegi(){
      this.warna = "Merah";
      this.sisi = 7;
   }

   //method
   protected void tampilWarna() {
      System.out.println("warna Persegi => " + this.warna);
   }

   protected void hitungKeliling() {
      this.keliling = this.sisi * 4;
      System.out.println("Keliling persegi dengan sisi " + this.sisi + "cm : " + this.keliling + "cm");
   }

   protected void hitungLuas() {
      this.luas = this.sisi * this.sisi;
      System.out.println("Luas persegi dengan sisi " + this.sisi + " cm     : " + this.luas + "cm2");
   }
}