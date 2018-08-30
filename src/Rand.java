import figures.*;

import java.util.Random;

public class Rand {
    static int minValue = 1;
    static int maxValue = 10;

    static String[]  colors = {
            "желтый",
            "красный",
            "черный",
            "синий",
            "фиолетовый",
            "берюзовый",
            "зеленый"
    };

    public static int NumInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + minValue) + min;
    }

    public static Figure getRandomFigure(){
        int tmp = NumInRange(1,4);

        if (tmp == minValue) return new Square(NumInRange(minValue,maxValue), colors[NumInRange(0,6)]);
        else if(tmp == 2) return new Circle(NumInRange(minValue,maxValue), colors[NumInRange(0,6)]);
        else if(tmp == 3 ) {
            int a = NumInRange(minValue, maxValue);
            int b = NumInRange(minValue, maxValue);
            int c = NumInRange(minValue, maxValue);

            while (Triangle.checkOfExistence(a,b,c)){
                a = NumInRange(minValue, maxValue);
                b = NumInRange(minValue, maxValue);
                c = NumInRange(minValue, maxValue);
            }

            return new Triangle(a,b,c, colors[NumInRange(0,6)]);
        }
        else {
            int a = NumInRange(minValue, maxValue);
            int b = NumInRange(minValue, maxValue);
            int c = NumInRange(minValue, maxValue);
            int d = NumInRange(minValue, maxValue);

            while (Trapezium.checkOfExistence(a,b,c,d)){
                a = NumInRange(minValue, maxValue);
                b = NumInRange(minValue, maxValue);
                c = NumInRange(minValue, maxValue);
                d = NumInRange(minValue, maxValue);
            }

            return new Trapezium(a,b,c,d, colors[NumInRange(0,6)]);
        }
    }
}
