class Graphpoint {
    double xaxis;
    double yaxis;

    void display() {
        System.out.println("x-axis: " + xaxis + ", y-axis: " + yaxis);
    }
}

public class MainClass7 {
    public static void main(String[] args) {
        System.out.println("main method");

        Graphpoint p1 = new Graphpoint();
        p1.xaxis = 3.2;
        p1.yaxis = 7.6;
        System.out.println("p1 -> x-axis: " + p1.xaxis + ", y-axis: " + p1.yaxis);

        Graphpoint p2 = new Graphpoint();
        p2.xaxis = 10.2;
        p2.yaxis = 5.0;
        p2.display();

        System.out.println("main method ended");
    }
}
