public class delapan{
	public static void main(String[] args){
		int awal = 1;
		int akhir = 110;
		System.out.println("Menampilkan angka berjumlah 11 per baris");
		System.out.println("Batas awal= "+awal);
		System.out.println("Batas akhir= "+akhir);
		while(awal<=akhir){
			System.out.print(+awal);
			System.out.print(" ");
			if(awal%11==0){
                System.out.println("\n");
            }

			awal++;
		}
	}

}