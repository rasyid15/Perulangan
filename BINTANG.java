package tugas_webex_perulanagan1_mrasyidr;
import java.util.Scanner;
public class BINTANG {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
  String lagi = "Y", nama;
    while(lagi.equals("Y")){
        System.out.println("Nama  = ");
        nama =input.next();
        System.out.println("Nilai = ");
        int nilai=input.nextInt();
    if(nilai>=400){
         System.out.println("NILAI TERLALU TINGGI");
         break;
        }else{
        System.out.println("Nama = "+nama);
        System.out.println("Jumlah nilai = "+nilai);
        System.out.println("Apakah Anda Masih ada data lagi yang ingin di masukan? (Y/T) ?");
        Scanner ulang = new Scanner(System.in);
        lagi = ulang.nextLine().toUpperCase();
        System.out.println("OK");}
     }   
       System.out.println("Terima Kasih");
    }
}
            

