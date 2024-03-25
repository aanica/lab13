package zadanie3;

public class Disk extends Circle {
    public Disk(Point center, double radius) {
        super(center, radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean pointInDisk(Point point) {
        double distance = Math.sqrt(Math.pow(this.center.x - point.x, 2) + Math.pow(this.center.y - point.y, 2));
        return distance <= this.radius;
    }
}
