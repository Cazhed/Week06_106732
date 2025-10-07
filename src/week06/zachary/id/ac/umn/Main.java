package week06.zachary.id.ac.umn;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Handphone handphone = null;
        Voucher voucher = null;
		
		int pilihan;
		do {
            System.out.println("----------- Menu Toko Voucher & HP -----------");
            System.out.println("1. Pesan Barang");
            System.out.println("2. Lihat Pesanan");
            System.out.println("3. Barang Baru");
            System.out.println("4. Keluar");
            System.out.print("Pilihan : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
            case 1:
                if (handphone == null && voucher == null) {
                    System.out.println("Tidak ada data barang.");
                    break;
                }

                System.out.println("Daftar Barang:");
                if (handphone != null) {
                	System.out.println("------------------------------------------------");
                	System.out.println("ID	: " + handphone.getId());
                	System.out.println("Nama 	: " + handphone.getNama());
                    System.out.println("Stock 	: " + handphone.getStok());
                    System.out.println("Harga 	: " + handphone.getHarga());
                }
                if (voucher != null) {
                	System.out.println("------------------------------------------------");
                    System.out.println("ID	: " + voucher.getId());
                    System.out.println("Nama 	: " + voucher.getNama());
                    System.out.println("Nominal : " + voucher.getNominal());
                    System.out.println("Stock 	: " + voucher.getStok());
                    System.out.println("Harga 	: " + voucher.getHarga());
                }
                System.out.print("Pesan Barang (ID): ");
                int jenis = input.nextInt();

                System.out.print("Masukkan Jumlah: ");
                int jumlah = input.nextInt();

                System.out.print("Masukkan jumlah uang: ");
                double uang = input.nextDouble();

                if (jenis == 1 && handphone != null) {
                    if (handphone.getStok() >= jumlah) {
                        double total = handphone.getHarga() * jumlah;
                        if (uang >= total) {
                            handphone.minusStok(jumlah);
                            System.out.println("Berhasil dipesan " + jumlah + " @ " + handphone.getNama());
                        } else {
                            System.out.println("Uang tidak cukup.");
                        }
                    } else {
                        System.out.println("Stok tidak mencukupi jumlah pesanan.");
                    }
                } else if (jenis == 2 && voucher != null) {
                    if (voucher.getStok() >= jumlah) {
                        double total = voucher.getHarga() * jumlah;
                        if (uang >= total) {
                            voucher.minusStok(jumlah);
                            System.out.println("Berhasil dipesan " + jumlah + " @ " + voucher.getNama());
                        } else {
                            System.out.println("Uang tidak cukup.");
                        }
                    } else {
                        System.out.println("Stok tidak mencukupi jumlah pesanan.");
                    }
                } else {
                    System.out.println("Barang tidak ditemukan.");
                }
                break;
                
	            case 2:
	                System.out.println("\n--- Daftar Barang ---");
	                if (handphone != null) {
	                    System.out.println("Handphone:");
	                    System.out.println("Nama	: " + handphone.getNama());
	                    System.out.println("Harga	: " + handphone.getHarga());
	                    System.out.println("Stok	: " + handphone.getStok());
	                    System.out.println("---------------------");
	                }
	                if (voucher != null) {
	                    System.out.println("Voucher:");
	                    System.out.println("Nama	: " + voucher.getNama());
	                    System.out.println("Nominal	: " + voucher.getNominal());
	                    System.out.println("Harga	: " + voucher.getHarga());
	                    System.out.println("Stok	: " + voucher.getStok());
	                    System.out.println("---------------------");
	                }
	                if (handphone == null && voucher == null) {
	                    System.out.println("Belum ada barang ditambahkan.");
	                }
	                System.out.println();
                break;
                
                case 3:
                    System.out.print("Voucher / Handphone (V/H): ");
                    jenis = input.nextLine().toLowerCase().charAt(0);
                    
                    if (jenis == 'v') {
                        System.out.print("Nama 	: ");
                        String nama = input.nextLine();
                        System.out.print("Harga	: ");
                        int nominal = input.nextInt();
                        System.out.print("Stok 	: ");
                        int stok = input.nextInt();
                        System.out.print("PPN 	: ");
                        double pajak = input.nextDouble();
                        input.nextLine();

                        voucher = new Voucher(2, nama, nominal, stok, pajak);
                        System.out.println("Voucher telah berhasil diinput.\n");
                    } 
                    else if (jenis == 'h') {
                        System.out.print("Nama 	: ");
                        String nama = input.nextLine();
                        System.out.print("Harga	: ");
                        int harga = input.nextInt();
                        System.out.print("Stok 	: ");
                        int stok = input.nextInt();
                        input.nextLine();
                        System.out.print("Warna	: ");
                        String warna = input.nextLine();

                        handphone = new Handphone(1, nama, harga, stok, warna);
                        System.out.println("Handphone telah berhasil diinput.\n");
                    } 
                    else {
                        System.out.println("Pilihan tidak valid. Gunakan 'v' atau 'h'.\n");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.\n");
                    break;
            }
        } while (pilihan != 0);

        input.close();
    }

}