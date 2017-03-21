class data{
	String kode_obat,jenis,nama,no_nota,tgl_beli,header;
	int harga,jml_obat,total;


	public void obat(){
		System.out.println("\t\t|| Kode Obat     || "+kode_obat+"       ||");
		System.out.println("\t\t|| Jenis Obat    || "+jenis+"        ||");
		System.out.println("\t\t|| Nama Obat     || "+nama+"  ||");
		System.out.println("\t\t|| Harga         || "+harga+"        ||");

	}

	public void transaksi(){
	System.out.println("\t\t|| No Nota       || "+no_nota+"       ||");
		System.out.println("\t\t|| Tanggal Beli  || "+tgl_beli+"   ||");
		System.out.println("\t\t|| Jumlah obat   || "+jml_obat+"            ||");
		System.out.println("\t\t|| Total Harga 	 || "+harga*jml_obat+"        ||");
	}

	public data(String header){
		this.header = header;
	}

	public void batas(){
		System.out.println("\n");
		System.out.println("\t\t||========== "+header+" ========||");
	}
}

public class apotek extends data{
	
	int harga = 15000;
	int jml_obat = 2;

	public void obat(){
		kode_obat = "PRM312";
		jenis = "Keras";
		nama = "Parasetamol";
		super.harga = harga;
		super.obat();
	}

	public void transaksi(){
		no_nota = "NT4412";
		tgl_beli = "21-03-2017";
		super.harga = harga;
		super.jml_obat = jml_obat;
		super.transaksi();
	}

	public apotek(String head){
		super(head);
	}

	public static void main(String[] args) {
		apotek d = new apotek("DATA APOTEK");
		d.batas();
		d.obat();
		System.out.println("\t\t||===============================||");
		d.transaksi();
		System.out.println("\t\t||===============================||");
	}
}