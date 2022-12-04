public class Laptop extends Perangkat {
    protected boolean webcam; //Attribute

    public Laptop(String drive,int ram,float processor,boolean webcam ){
        super(drive,ram,processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi(){
        if (webcam == true){
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " gb dan processor secepat " + processor + " ghz. Selain itu Laptop ini Memiliki webcam");
        }else{
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " gb dan processor secepat " + processor + " ghz. Selain itu Laptop ini tidak Memiliki webcam");
        }
    }

    public void bukagame(String Namagame){
        System.out.println("Laptop sedang membuka game " + Namagame);
    }

    public void kirim_Email(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }

    public void kirim_Email(String email1,String email2){
        System.out.println("Laptop berhasil mengirim Email ke  " + email1 + " dan ke " + email2);
    }
}
