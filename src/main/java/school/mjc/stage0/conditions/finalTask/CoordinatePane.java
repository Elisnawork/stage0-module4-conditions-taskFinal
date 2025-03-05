package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x == 0 || y == 0){
            System.out.println("zero");
            return;
        }
        switch (x > 0 ? (y > 0 ? 1 : 4) : (y > 0 ? 2: 3 )){
            case 1 -> System.out.println("first");
            case 2 -> System.out.println("second");
            case 3 -> System.out.println("third");
            case 4 -> System.out.println("fourth");
        }
    }
}
