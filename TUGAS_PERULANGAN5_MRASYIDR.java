
package tugas_webex_perulanagan1_mrasyidr;
import java.util.Scanner;
public class TUGAS_PERULANGAN5_MRASYIDR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int  jumlahSiswa; 
        String namaSiswa;
        System.out.println("Jumlah Siswa");
        jumlahSiswa= input.nextInt();
        
        
        for(int a=1; a<=jumlahSiswa; a++){
            System.out.println("Nama Siswa "+a);
            namaSiswa= input.next();
        }
       
    }
}
