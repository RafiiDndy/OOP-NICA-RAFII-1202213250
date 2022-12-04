public class Perangkat {
    //Attribute
    protected String drive;
    protected int ram;
    protected float processor;

    //Constructor
    public Perangkat (String drive,int ram,float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    //Method Informasi
    public void informasi(){
        System.out.println();
    }
}
