public class perusahaan{
	public static void main(String[] args) {
		divisi dv = new divisi();
		gaji gj = new gaji();
		status st = new status();
		karyawan kr = new karyawan();

		System.out.println("\n    DATA KARYAWAN PT.DJARUM\n");
		kr.data_karyawan();
		dv.nama_divisi();
		gj.gj_pokok();
		st.nama_status();
		}
}

class karyawan{
	private String nip,nama,tmp_lhr;
	private char jk;
	public char gol;
	public int kd_status,kd_divisi;

	public void data_karyawan(){
		nip = "10115190";
		nama = "Mustika Dwi Hidayati";
		tmp_lhr = "Kota Bengkulu";
		jk = 'P';

		System.out.println("NIP \t\t: "+nip);
		System.out.println("Nama \t\t: "+nama);
		System.out.println("Tempat Lahir \t: "+tmp_lhr);
		System.out.println("Jenis Kelamin \t: "+jk);
	}

	public void kode_divisi(){
		kd_divisi = 12345;
		System.out.println("Kode Divisi \t: "+kd_divisi);
	}

	public void golongan(){
		gol = 'B';
		System.out.println("Golongan \t: "+gol);
	}

	public void kode_status(){
		kd_status = 2;
		System.out.println("Kode Status \t: "+kd_status);
	}
}

class divisi{	
	public void nama_divisi(){
		String nama_divisi;
		karyawan kd = new karyawan();
		nama_divisi = "Keuangan";

		kd.kode_divisi();
		System.out.println("Nama Divisi \t: "+nama_divisi);
	}
}

class gaji{
	public void gj_pokok(){
		int gaji_pokok;
		karyawan g = new karyawan();
		gaji_pokok = 4000000;

		g.golongan();
		System.out.println("Gaji Pokok \t: "+gaji_pokok);
	}
}

class status{
	public void nama_status(){
		String nama_status;
		karyawan s = new karyawan();
		nama_status = "Kontrak";

		s.kode_status();
		System.out.println("Status \t\t: "+nama_status);
	}
}