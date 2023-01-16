public class WaterBottle {
    private double volume;


    public WaterBottle(){
        this.volume =100;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double newVolume){
        this.volume = newVolume;
    }

    public void drink(){
        double newVolume = volume - 10;
        setVolume(newVolume);
    }
    public void empty(){
        setVolume(0);
    }
    public void fill(){
        setVolume(100);
    }
}
