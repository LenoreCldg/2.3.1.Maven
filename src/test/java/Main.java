public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_00;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        boolean passed = actual == expected;

        System.out.println(passed);
    }
}
