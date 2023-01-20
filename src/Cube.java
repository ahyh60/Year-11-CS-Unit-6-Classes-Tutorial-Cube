public class Cube {
    private int side;
    public Cube(){
        side = 1;
    }
    public Cube(int x){
        if(x < 1)
            System.out.println("A cube's side length cannot be less than 1!");
        else
            side = x;
    }

    public int getSide(){
        return side;
    }
    public void setSide(int x){
        side = x;
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
