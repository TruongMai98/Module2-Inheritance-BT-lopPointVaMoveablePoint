public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
//    private float[] arr;
     public MovablePoint() {
     }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
         this.xSpeed = xSpeed;
         this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
         float[] array = {xSpeed, ySpeed};
        for (float a : array) {
            System.out.print(a + "\t");
        }
        return array;
    }

    public String toString(){
         return super.toString() +
                 ", speed = (" +
                 xSpeed +
                 ", " +
                 ySpeed +
                 ")";
    }

   public float moveX() {
       float x = getX() + xSpeed;
       return x;
   }

    public float moveY() {
        float x = getX() + xSpeed;
        return x;
    }

    public String move() {
         return "x = " +
                 moveX() +
                 " y = " +
                 moveY();
    }
}
