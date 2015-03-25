public class sebelas {
    public static void main(String[] args) {
        int panjang=7;
        System.out.println("Menggambar dengan karakter #");
        for (int baris=1;baris<=panjang;baris++){
        	if (baris%2==0){
        		System.out.print(" ");
        	}
            for (int pager=1;pager<=panjang;pager++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
