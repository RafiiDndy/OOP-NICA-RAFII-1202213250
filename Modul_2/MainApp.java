package Modul_2;

public class MainApp {
    public static void main(String[] args) throws Exception{
        TransportasiAir transportasiair = new TransportasiAir(20,10000);
        transportasiair.informasi();
        transportasiair.berlayar();
        transportasiair.berlabuh();
        System.out.println(" ");

        Sampan sampan = new Sampan(5,15000,1);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(1);;
        System.out.println(" ");

        Kapal kapal = new Kapal(5,25000,"Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(2);
        kapal.berlabuh();;
        System.out.println(" ");
    }
}
