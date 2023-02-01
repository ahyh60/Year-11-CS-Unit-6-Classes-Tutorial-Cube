public class Cube {
    private int side;
    public Cube(){
        side = 1;
    }
    public Cube(int x){
        if(x < 1)
            throw new IllegalArgumentException();
        else
            side = x;
    }

    public int getSide(){
        return side;
    }
    public void setSide(int x){
        side = x;
        if (side<1 ){
            throw new IllegalArgumentException();
        }
    }
    public int getSurfaceArea(){
        int sArea = side * side * 6;
        return sArea;
    }
    public int getVolume(){
        int volume = side * side * side;
        return volume;
    }
    public String toString(){
        String x = "Cube{side = " + side + "}";
        return x;
    }
}
