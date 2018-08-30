package figures;

public class Square extends Figure{

    private String type = "квадрат";
    private float sideSize;

    public Square(float sideSize, String color) {
        super(color);
        this.sideSize = sideSize;

        this.square = (float) Math.pow(sideSize, 2);
    }

    public float getSideSize(){
        return sideSize;
    }

    public float getDiagonal(){
        return (float) Math.sqrt(2) * sideSize;
    }

    public void info(){
        System.out.printf("Фигура: %s, площадь: %.1f кв. ед., длина стороны: %.1f ед., цвет: %s \n", type, square, sideSize, color);
    }
}
