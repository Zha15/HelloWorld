import javax.swing.*;

public class perhitungan2

{

public static void main(String args[])

{

String pilihan=JOptionPane.showInputDialog

("pilih Perhitungan, pilihan: 1.Tambah 2.Kurang 3.kali 4.Bagi");

int pilih=Integer.parseInt(pilihan);

switch(pilih)

{

case 1: String a1=JOptionPane.showInputDialog

("Masukan Angka Pertama");

String a2=JOptionPane.showInputDialog

("Masukan Angka Kedua");

int asatu = Integer.parseInt(a1);

int adua = Integer.parseInt(a2);

int ahasil;

ahasil = asatu + adua;

System.out.println( a1 + " + " + a2 + " = " + ahasil);

break;

case 2: String b1=JOptionPane.showInputDialog

("Masukan Angka Pertama");

String b2=JOptionPane.showInputDialog

("Masukan Angka Kedua");

int bsatu = Integer.parseInt(b1);

int bdua = Integer.parseInt(b2);

int bhasil;

bhasil = bsatu - bdua;

System.out.println(b1 + " - " + b2 + " = " + bhasil);

break;

case 3: String c1=JOptionPane.showInputDialog

("Masukan Angka Pertama");

String c2=JOptionPane.showInputDialog

("Masukan Angka Kedua");

int csatu = Integer.parseInt(c1);

int cdua = Integer.parseInt(c2);

int chasil;

chasil = csatu * cdua;

System.out.println(c1 + " x " + c2 + " = " + chasil);

break;

case 4: String d1=JOptionPane.showInputDialog

("Masukan Angka Pertama");

String d2=JOptionPane.showInputDialog

("Masukan Angka Kedua");

int dsatu = Integer.parseInt(d1);

int ddua = Integer.parseInt(d2);

int dhasil;

dhasil = dsatu / ddua;

System.out.println(d1 + " / " + d2 + " = " + dhasil);

break;

default:System.out.println("pilihan salah");

break;

}

System.exit(0);

}

}