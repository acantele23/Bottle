public class App {
    public static void main(String[] args)
    {
        Bottle b = new Bottle(16);
        b.fill(5);
        b.fill(8);
        b.fill(10);

        b.pour(10);
        b.pour(3);

        b.getCurrentFillAmount();

        b.pour(20);
        b.pour(10);
    }
}
