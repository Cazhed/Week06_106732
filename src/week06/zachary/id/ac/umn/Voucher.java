package week06.zachary.id.ac.umn;

public class Voucher extends Barang {
	private double pajak;
	private int nominal;
	public static int total;
	
	public Voucher(int id, String nama, int nominal, int stok, double pajak) {
		super(id, nama, nominal + (nominal * pajak));
		this.pajak = pajak;
		this.nominal = nominal;
		this.setStok(stok);
		total++;
	}
	
	public double getPajak() {
		return this.pajak;
	}
	
	public double getNominal() {
		return this.nominal;
	}
	
	public double gethargaJual() {
		return getHarga() + (getHarga() * pajak);
	}
}
