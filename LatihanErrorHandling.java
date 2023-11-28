
//ackage javaapplication11;

/**
 * Nama  : Yudi Afandi
 * Kelas : Sistem informasi (A)
 * tanggal : 23/11/2023
 * Deskripsi : Latihan Error
 */
public class LatihanErrorHandling {
        public static void main(String[] args) {
            int x = 8;
            int y = 0;
            String hasil = pembagian(x, y);
            System.out.println("hasil bagi : " + hasil);
    }
        public static String pembagian(int x, int y){
            try {
                 int hasil = x / y;
            return "sukses";
            } catch (ArithmeticException cudid){
               System.out.println(cudid.getMessage());
                return cudid.toString();
                
            }
        }
}
            
