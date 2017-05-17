import javax.swing.*;

public class logif

{

String ket;

public static void main (String [] args)

{

logif hitung =new logif();

String nilaimin=JOptionPane.showInputDialog

("Masukan batas nilai minimal kelulusan");

int nilaibatas = Integer.parseInt(nilaimin);

String Nilai=JOptionPane.showInputDialog

("Masukan nilai anda");

int nilaianda = Integer.parseInt(Nilai);

if (nilaianda < nilaibatas)

{

hitung.ket="TIDAK LULUS";

}

if (nilaianda >= nilaibatas)

{

hitung.ket="LULUS";

}

System.out.println("Nilai Anda = "+nilaianda);

System.out.println("batas nilai minimal kelulusan = "+nilaibatas);

System.out.println("Hasil keterangan = "+hitung.ket);

}

}