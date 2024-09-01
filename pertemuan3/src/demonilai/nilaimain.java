package demonilai;

public class nilaimain {
	public static void main(String[] args) {
		Nilai nilai1 = new Nilai();
		
		nilai1.nama = "Dafa";
		nilai1.nim = "1238412";
		
		nilai1.NA = 100;
		nilai1.NT = 100;
		nilai1.UTS = 100;
		nilai1.UAS = 100;
		nilai1.nilai();
		nilai1.cn();
	}
}

class Nilai {
	String nim;
	String nama;
	
	float NA;
	float NT;
	float UTS;
	float UAS;
	float Nakhir;
	
	void nilai() {
		NA = NA * 10/100;
		NT = NT * 20/100;
		UTS = UTS * 30/100;
		UAS = UAS * 40/100;
		Nakhir = NA + NT + UTS + UAS + Nakhir;
	}
	
	void cn() {
		System.out.println("Nim anda : " + nim);
		System.out.println("Nama anda : " + nama);
		System.out.println("Nilai absen anda : " + NA);
		System.out.println("Nilai tugas anda : " + NT);
		System.out.println("Nilai UTS anda : " + UTS);
		System.out.println("Nilai UAS anda : " + UAS);
		System.out.println("Nilai Akhir anda : " + Nakhir);
	}
}