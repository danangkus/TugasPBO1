public class duabelas {
    public static void main(String[] args) {
        System.out.println("Menggambar dengan karakter #");
        int panjang=5;
        int tinggi=7;
        for (int baris=1;baris<=tinggi;baris++){
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
