public class tipedata{
	public static void main(String[] args) {
		//Tipe Data
		String nip = "10115190";
		String nama = "Mustika Dwi Hidayati";
		String tmp_lhr = "Kota Bengkulu";
		String nm_dvs1 = "Keuangan";
		String stt1 = "Kontrak";
		String stt2 = "Tetap";
		
		int gj_pkk = 4000000;
		int kd_dvs1 = 1;
		int kd_stt1 = 1;
		
		char jk1 = 'L';
		char jk2 = 'P';	
		char glg1 = 'A';
		char glg2 = 'B';
		char glg3 = 'C';
		
		//Tampil Data
		System.out.println("\t\t TIPE DATA KARYAWAN PT.DJARUM");
		System.out.println("");
		System.out.println("Data");
		System.out.println("");
		System.out.println("NIP           : " +nip);
		System.out.println("Nama          : " +nama);
		System.out.println("Tempat Lahir  : " +tmp_lhr);
		System.out.println("Jenis Kelamin : " +jk2);
		System.out.println("Kode Divisi   : " +kd_dvs1);
		System.out.println("Nama Divisi   : " +nm_dvs1);
		System.out.println("Golongan      : " +glg2);
		System.out.println("Gaji Pokok    : " +gj_pkk);
		System.out.println("Kode Status   : " +kd_stt1);
		System.out.println("Status        : " +stt1);
		
		//Tampil Length Data
		System.out.println("");
		System.out.println("");
		System.out.println("Length Data");
		System.out.println("");
		System.out.println("Panjang String NIP          : "+nip.length());
		System.out.println("Panjang String Nama         : "+nama.length());
		System.out.println("Panjang String Tempat Lahir : "+tmp_lhr.length());
		System.out.println("Panjang String Nama Divisi  : "+nm_dvs1.length());
		System.out.println("Panjang String Status       : "+stt1.length());
	}
}