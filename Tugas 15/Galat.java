public class Galat implements StrukturGalat {

  public void message(String kode) {
    switch (kode) {
      case "NOTEXIST": System.out.print("Data tidak tersedia.\n"); break;
      case "ADDDATA": System.out.print("Silahkan tambah data terlebih dahulu.\n"); break;
      case "JARGON": System.out.print("ETok, kenyamanan tiada henti (^_^)/\n"); break;
      default: System.out.print("\n"); break;
    }
  }

}