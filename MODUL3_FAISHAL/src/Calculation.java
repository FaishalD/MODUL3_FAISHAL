public class Calculation implements Runnable {
    double radius;
    double side;
    double area;
    double phi = 3.14;

    /*square*/
    public void setSquare(double side) throws IllegalArgumentException {
        if (side < 1) {
            throw new IllegalArgumentException("Illegal Exception");
        }

        this.side = side;
        this.area = side*side;
    }

    public double getSquare() {
        return this.area;
    }

    /*circle*/
    public void setCircle(double radius) throws IllegalArgumentException {
        if (radius < 1) {
            throw new IllegalArgumentException("Illegal Exception");
        }

        this.radius = radius;
        this.area   = phi*radius*radius;
    }

    public double getCircle() {
        return this.area;
    }

    /*Trapezoid*/
    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
        if (a < 1 || b < 1 || t < 1) {
            throw new IllegalArgumentException("Illegal Exception");
        }

        this.area   = (a + b) * t/2;
    }

    public double getTrapezoid() {
        return this.area;
    }

    @Override
    public void run() {
        System.out.println("Program will start in: ");
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }

            catch (InterruptedException e) {
                System.out.println("error message");
            }
        }
    }   
}
