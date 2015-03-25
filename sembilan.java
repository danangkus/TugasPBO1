public class sembilan {
    public static void main(String[] args) {
        int awal=1;
        int akhir=50;
        System.out.println("Menampilkan 11 angka per baris dan kelipatan 5 bertuliskan JONI\n");
        while(awal<=akhir){
            if(awal%5==0){
                System.out.print("JONI");
            }else {
                System.out.print(+awal);
            }
            System.out.print(" ");
            if(awal%11==0){
                System.out.println("\n");
            }
            awal++;
        }
    }
}