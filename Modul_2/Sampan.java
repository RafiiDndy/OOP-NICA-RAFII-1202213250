package Modul_2;

public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahkursi,int biaya, int layar){
        super(jumlahkursi,biaya);
        this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi "+ jumlahkursi +" ditetapkan dengan biaya sebesar Rp. "+biaya);
    }

    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan "+layar+" layar");
    }

    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai tanpa jangkar");
    }

    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan "+jangkar+" jangkar");
    }
}
