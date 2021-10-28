package exercises.echo;

public class EchoTester {
    // loop should display string "echo..." four times integer 10, which is sum of object incrementation
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;

        while (x < 4) {
            e1.welcome();
            e1.quantity = e1.quantity + 1;
            if (x > 0) {
                e2.quantity = e2.quantity + 1;
            }
            if (x > 1) {
                e2.quantity = e2.quantity + e1.quantity;
            }
            x = x + 1;
        }
        System.out.println(e2.quantity);
    }
}
