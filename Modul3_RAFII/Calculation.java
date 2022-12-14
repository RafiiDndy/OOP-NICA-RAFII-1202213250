package Modul3_RAFII;

public class Calculation implements Runnable {
    public double radius, side, area;
    public double phi = 3.14;

    public void setSquare(double side) throws IllegalArgumentException{
        if (side < 1){
            throw new IllegalArgumentException("Tidak boleh kurang dari 1!");
        }
        this.area = side*side;
    }

    public double getSquare(){
        return this.area;
    }

    public void setCircle(double radius) throws IllegalArgumentException{
        if (radius < 1){
            throw new IllegalArgumentException("Tidak boleh kurang dari 1!");
        }
        this.area = phi*(radius*radius);
    }

    public double getCircle(){
        return this.area;
    }

    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException{
        if (a < 1 || b < 1){
            throw new IllegalArgumentException("Tidak boleh kurang dari 1!");
        }
        this.area = (a+b)*t*0.5;
    }

    public double getTrapezoid(){
        return this.area;
    }

    @Override
    public void run(){
        System.out.println("Program will start in :");
        for (int i = 3; i > 0; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Terjadi kesalahan: "+ e.getMessage());
            }
        }
        System.out.println("Program selesai");
    }
}
