package week06.zachary.id.ac.umn;

public class Barang {
	private int id;
	private double harga;
	private String nama;
	private int stok;
	
	public Barang(int id, String nama, double harga, int stok) {
		this.id = id;
		this.nama = nama;
		this.harga = harga;
		this.stok = 0;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNama() {
		return this.nama;
	}
	
	public double getHarga() {
		return this.harga;
	}
	
	public int getStok() {
		return this.stok;
	}
	
	public void minusStok(int jml) {
		if (this.stok >= jml) {
			this.stok -= jml;
		} else {
			System.out.println("Stok habis.");
		}
	}
}
