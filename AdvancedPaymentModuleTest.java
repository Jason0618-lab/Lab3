public class AdvancedPaymentModuleTest {

    public static void main(String[] args) {

        Employee[] employees = {

            new Fulltimer("John", 3000),

            new Manager("Mike", 5000, 5),

            new Manager("David", 5000, 12),

            new Hourly("Tom", 20, 100)
        };

        AdvancedPaymentModule module =
                new AdvancedPaymentModule();

        module.payment(employees);

        System.out.println(
                "Total Pay = " + module.getTotalPay()
        );
    }
}