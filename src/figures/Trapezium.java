package figures;

public class Trapezium extends Figure {

    private String type = "трапеция";
    private float a, b, h, c, d;

    public Trapezium(float littleBasis, float bigBasis, float c, float d, String color) {
        super(color);
        this.a = littleBasis;
        this.b = bigBasis;
        this.c = c;
        this.d = d;

        h = (float) Math.sqrt(c*c - ((a*a - 2*a*b + b*b + c*c - d*d)/ 2*(a-b)));
        square = ((a+b)*h)/2;
    }

    public float getMiddleLine(){
        return (a+b)/2;
    }

    public float circleRadius(){
        return h/2;
    }

    public void info(){
        System.out.printf("Фигура: %s, площадь: %.1f кв. ед., основы: [%.1f ед., %.1f ед.] , цвет: %s\n", type, square, a,b, color);
    }

    public static Boolean checkOfExistence(float a, float b, float c, float d){
        if (a + b + c > d && b + c + d > c && c + a + d > b && b + c + d > a) return false;
        else return true;
    }
}
