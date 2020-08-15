package Lesson06;

public class Point {

    private int x, y, z;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Point() {

    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void show() {
        System.out.println("Diem vau nhap co toa do la (" + x + "," + y + "," + y + ")");
    }

}
