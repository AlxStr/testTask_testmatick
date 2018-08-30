package figures;

public class Triangle extends Figure {

    private String type = "треугольник";
    private float a,b,c;


    public Triangle(float cathetusA, float cathetusB, float hypotenuse, String color) {
        super(color);
        this.a = cathetusA;
        this.b = cathetusB;
        this.c = hypotenuse;

        square = (a*b)/2;
    }

    public float getHypotenuse(){
        return (float) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public float getPerimetr(){
        return a+b+c;
    }

    public void info(){
        System.out.printf("Фигура: %s, площадь: %.1f кв. ед., гипотенуза: %.1f ед., катеты: [%.1f ед., %.1f ед.], цвет: %s \n", type, square, getHypotenuse(), a,b , color);
    }

    public static Boolean checkOfExistence(float a, float b, float c){
        if (a + b > c && b + c > a && c + a > b) return false;
        else return true;
    }
}
