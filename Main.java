public class Main {
    public static void main(String[] args) {

        Point p = new Point(3, 4);
        System.out.println(p.distance());
        System.out.println(p.distance(6, 12));
        Point q = new Point(3, 8);
        System.out.println(p.distance(q));
        //System.out.println("Hello world!");
    }
}