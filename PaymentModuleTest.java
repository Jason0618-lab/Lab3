public class PaymentModuleTest {

    public static void main(String[] args) {

        PaymentModule module = new PaymentModule();

        Employee e1 =
                new Fulltimer("John", 3000);

        Employee e2 =
                new Manager("Mike", 5000, 5);

        Employee e3 =
                new Manager("David", 5000, 12);

        Employee e4 =
                new Hourly("Tom", 20, 100);

        module.payment(e1);
        module.payment(e2);
        module.payment(e3);
        module.payment(e4);

        System.out.println(
                "Total Pay = " + module.getTotalPay()
        );
    }
}