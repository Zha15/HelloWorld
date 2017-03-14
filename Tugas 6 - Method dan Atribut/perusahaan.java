public class perusahaan{
	public static void main(String[] args) {
		divisi dv = new divisi();
		gaji gj = new gaji();
		status st = new status();
		karyawan kr = new karyawan();
		pekerjaan kerja = new pekerjaan();
		quote q = new quote();
		
		q.isiMotto("Mencoba Selagi Bernapas");

		System.out.println("\n    DATA KARYAWAN PT.DJARUM\n");
		kr.data_karyawan();
		dv.nama_divisi();
		gj.gj_pokok();
		st.nama_status();
		System.out.println("");
		System.out.println("Pekerjaan \t: "+kerja.bagian);
		System.out.println("Pengalaman \t: "+q.pengalaman);
		System.out.println("Motto \t\t: "+q.motto);
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
		int lmbr;
		int bns;
		int tot_gaji;
		
		karyawan g = new karyawan();
		gaji_pokok = 4000000;
		lmbr = 6;
		gaji bonus = new gaji();
		bns = bonus.bonus_lmbr(4);
		tot_gaji = bns + gaji_pokok;
		
		g.golongan();
		System.out.println("Gaji Pokok \t: "+gaji_pokok);
		System.out.println("Lembur \t\t: "+lmbr+" jam");
		System.out.println("Bonus Lembur \t: "+bns);
		System.out.println("Gaji Total \t: "+tot_gaji);
	}
	private int bonus_lmbr(int x){
		return 50000*x;
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

class pekerjaan{
	String bagian;
	
	public pekerjaan(){
		bagian = "Menangani Pendataan Keuangan Perusahaan";
	}
}

class quote{
	String motto;
	String pengalaman;

	public void isiMotto(String motto){
		this.motto = motto;
	}

	public quote(){
		this.pengalaman = "Tidak Ada";
	}
}