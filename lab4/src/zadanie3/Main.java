package zadanie3;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(0, 0);
        Disk disk = new Disk(center, 1);
        System.out.println(disk.pointInDisk(new Point(0, 0)));
        System.out.println(disk.pointInDisk(new Point(1, 1)));
        disk.setRadius(2);
        System.out.println(disk.pointInDisk(new Point(1, 1)));
    }
}
