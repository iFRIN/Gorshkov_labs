import java.util.Scanner;


public class Lab2gor {

    private double xCoord;
    private double yCoord;
    private double zCoord;


    
    public Point3d(double x, double y, double z) { 
        xCoord = x; yCoord = y; zCoord = z; 
    }

    
    public Point3d() {
        this(0, 0, 0); 
    }


    public double getX() { 
        return xCoord; 
    }
    public double getY() { 
        return yCoord; 
    }
    public double getZ() { 
        return zCoord; 
    }


    /*  установка координат точки */
    public void setX(double val) { 
        xCoord = val; 
    }
    public void setY(double val) { 
        yCoord = val; 
    }
    public void setZ(double val) { 
        zCoord = val; 
    }


    /* вывод координат точки */
    void displayPoint() {
        System.out.print("Input point's coordinates: ("+xCoord+"; "+yCoord+"; "+zCoord+")"); 
    }


    /* ввод координат точки */
    void inputPoint() {
        Scanner inp = new Scanner(System.in);
        System.out.print("\nEnter x: ");
        double a = inp.nextDouble(); setX(a);
        System.out.print("Enter y: ");
        double b = inp.nextDouble(); setY(b);
        System.out.print("Enter z: ");
        double c = inp.nextDouble(); setZ(c);
        displayPoint();
    }


    /* сравнение двух точек  */
    boolean areEqual(Point3d a) {
        if (xCoord == a.xCoord && yCoord == a.yCoord && zCoord == a.zCoord)         
                return true;
        else 
                return false;
    }


    /** вычисление расстояния между двумя точками
      * d = ((x2-x1)^2 + (y2-y1)^2 + (z2-z1)^2)^(1/2) **/
    double distanceTo(Point3d a) {
        return Math.sqrt(Math.pow(xCoord - a.xCoord, 2) + Math.pow(yCoord - a.yCoord, 2) + Math.pow(zCoord - a.zCoord, 2));
    }


    /** вычисление площади треугольника по формуле Герона
    * sh = (s * (s - a) * (s - b) * (s - c)) ^ (1 / 2), где
    * s = (a + b + c) / 2 **/
    public static double computeArea(Point3d first, Point3d second, Point3d third) {
        double a, b, c, s;
        a = second.distanceTo(third);
        b = first.distanceTo(second);
        c = first.distanceTo(third);
        s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

