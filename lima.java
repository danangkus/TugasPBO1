public class lima{
	public static void main(String[] args){
		int awal = 1;
		int akhir = 10;
		System.out.println("Menghitung angka");
		System.out.println("Batas awal= "+awal);
		System.out.println("Batas akhir= "+akhir);
		while(awal<=akhir){
			System.out.print(+awal);
			if(awal<akhir){
				System.out.print(",");
			}
			awal++;
		}
	}

}