package figures;

public class Figure {

    protected String color;
    protected float square;

    public Figure(String color) {
        this.color = color;
    }

    public void info(){}
    public void draw(){}
    public float getSquare(){
        return square;
    }

    public String getColor(){
        return color;
    }
}
