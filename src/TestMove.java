public class TestMove {
    public static void main(String[] args) {
        MovablePoint move1 = new MovablePoint(1.0f,1.0f, 10.0f,10.0f);

        System.out.println(move1);
        System.out.println(move1.move());
    }
}
