public class empat{
	public static void main(String[] args){
		int angka = 1;
		System.out.println("Konversi angka ke huruf dengan switch case");
		System.out.println("Angka masukan anda:"+angka);
		System.out.print("Hasil Konversi: ");
		switch(angka){
			case 1: System.out.println("Satu");
			break;
			case 2: System.out.println("Dua");
			break;
			case 3: System.out.println("Tiga");
			break;
			case 4: System.out.println("Empat");
			break;
			case 5: System.out.println("Lima");
			break;
			case 6: System.out.println("Enam");
			break;
			case 7: System.out.println("Tujuh");
			break;
			case 8: System.out.println("Delapan");
			break;
			case 9: System.out.println("Sembilan");
			break;
			default: System.out.println("Masukan harus 1-9");
		}
		System.exit(0);
	}

}