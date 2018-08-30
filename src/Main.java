import figures.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static int objectCount = Rand.NumInRange(1, 20);

    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();

        for (int i=0; i<objectCount; i++){
            figures.add(Rand.getRandomFigure());
        }

        Iterator<Figure> iter = figures.iterator();
        while(iter.hasNext()){
           iter.next().info();
        }
    }
}
