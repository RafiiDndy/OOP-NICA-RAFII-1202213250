public class MainApp {
    public static void main(String[] args) throws Exception{
        System.out.println("Model perangkat");
        Handphone handphone = new Handphone("Adata", 6, 3, false);
        handphone.informasi();
        handphone.telfon(628136781);
        handphone.kirimSMS(628136781);
        handphone.kirimSMS(628136781, 628125643);
        System.out.println(" ");

        Laptop laptop = new Laptop("Seagate", 16, 4, true);
        laptop.informasi();
        laptop.bukagame("Valorant");
        laptop.kirim_Email("adrean19@gmail.com");
        laptop.kirim_Email("adrean19@gmail.com", "yatrea4@gmail.com");
        System.out.println(" ");
    }
}
