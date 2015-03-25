public class enam{
	public static void main(String[] args){
		int awal = 1;
		int akhir = 10;
		int jumlah = 0;
		System.out.println("Menghitung angka");
		System.out.println("Batas awal= "+awal);
		System.out.println("Batas akhir= "+akhir);
		while(awal<=akhir){
			jumlah=jumlah+awal;
			awal++;
		}
		System.out.println("Jumlah dari deretan angka diatas= "+jumlah);
	}

}