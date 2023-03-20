public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double pay = service.calculate(1000000,9.99,12 );
        System.out.println("Ежемесячный платеж: " + pay);
        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate(1000_000, 9.99, 24));
        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate(1000_000, 9.99, 36));
    }
}