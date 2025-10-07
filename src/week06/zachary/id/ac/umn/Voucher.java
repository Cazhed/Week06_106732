package week06.zachary.id.ac.umn;

public class Voucher extends Barang {
	private double pajak;
	public static int total;
	
	public Voucher(int id, String nama, double harga, int stok, String warna) {
		super(id, nama, harga, stok);
		this.pajak = pajak;
		total++;
	}
	
	public double getPajak() {
		return this.pajak;
	}
	
	public double gethargaJual() {
		return getHarga() + (getHarga() * pajak);
	}
}
