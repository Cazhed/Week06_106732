package week06.zachary.id.ac.umn;

public class Handphone extends Barang {
	private String warna;
	private static int total;
	
	public Handphone(int id, String nama, double harga, int stok, String warna) {
		super(id, nama, harga, stok);
		this.warna = warna;
		total++;
	}
	
	public String getWarna() {
		return this.warna;
	}
}
