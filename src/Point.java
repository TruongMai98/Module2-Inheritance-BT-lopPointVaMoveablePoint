public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
//    private float[] array;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = {x, y};
        for (float a: array) {
            System.out.print(a + "\t");
        }
        return array;
    }

    public String toString() {
        return "(" +
                x +
                ", " +
                y +
                ")";
    }


}
