package mahasiswa;

public class mahasiswamain{
	public static void main(String[] args) {
		mahasiswaberaksi ms1 = new mahasiswaberaksi();
				
		ms1.membaca();
		ms1.menyontek();
		ms1.memodifikasi();
	}
}

class mahasiswaberaksi {
	void membaca() {
		System.out.println("Mahasiswa bisa membaca");
	}
	void menyontek() {
		System.out.println("Mahasiswa tidak boleh menyontek");
	}
	void memodifikasi() {
		System.out.println("Mahasiswa boleh memodifikasi");
	}
}