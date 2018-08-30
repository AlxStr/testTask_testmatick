package figures;

public class Circle extends Figure {

    private String type = "круг";
    private float radius;

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;

        this.square = (float) (Math.PI * Math.pow(radius, 2));
    }

    public float getRadius(){
        return radius;
    }

    public float getDiameter(){
        return radius*2;
    }
    public void info(){
        System.out.printf("Фигура: %s, площадь: %.1f кв. ед., радиус: %.1f ед., цвет: %s \n", type, square, radius, color);
    }
}
