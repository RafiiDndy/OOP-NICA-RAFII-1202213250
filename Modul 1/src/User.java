import java.util.Scanner;

public class User {
    String nama;
    int NIM;
    
    public void setName(String nama){
            this.nama = nama;
        }

    public void setName(int NIM){
        this.NIM = NIM;
    }
    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void Register(){
        System.out.print("Selamat datang di restoran EAD");
        System.out.print("Silahkan registrasi terlebih dahulu");
        System.out.print("==================================");
        System.out.print("Nama = "+ nama);
        System.out.print("Nomor telpon = "+ NIM);
    }


}
