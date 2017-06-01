public class Lab3gor {
    public static void main (String[] args) {

        boolean check;
        double S;	
        Point3d firstPoint = new Point3d(), secondPoint = new Point3d(), thirdPoint = new Point3d();

        for ( ; ; ) {
            firstPoint.inputPoint(); secondPoint.inputPoint(); thirdPoint.inputPoint();
            if (firstPoint.areEqual(secondPoint) || secondPoint.areEqual(thirdPoint) || firstPoint.areEqual(thirdPoint))
                System.out.print("\nSome of the points are the same. Enter the data once again.");
            else 
                break; 
        }

        S = thirdPoint.computeArea(firstPoint, secondPoint, thirdPoint);
        System.out.format("\nThe area within the triangle bounded by the three input points is: %.3f%n", S);

    }
}