public class tujuh{
	public static void main(String[] args){
		int awal = 1;
		int akhir = 10;
		float jumlah = 0;
		float rata = 0;
		System.out.println("Menghitung Rata-rata");
		System.out.println("Batas awal= "+awal);
		System.out.println("Batas akhir= "+akhir);
		while(awal<=akhir){
			jumlah=jumlah+awal;
			awal++;
		}
		rata=jumlah/akhir;
		System.out.println("Jumlah dari deretan angka diatas= "+jumlah);
		System.out.println("Rata-rata= "+rata);
	}

}