public class WaterBottle {
    private double volume;

    public WaterBottle(){
        this.volume = 100.0;
    }

    public void drink(){
        this.volume -= 10.0;
    }

    public void empty(){
        this.volume = 0.0;
    }

    public void fill(){
        this.volume = 100.0;
    }
}
