public class CreditPaymentService {
    public double calculate(double summa, double p, double n) {
        //n - количество месяцев
        //r - процент
        double r = p / 100 / 12;
        double pay = summa * ((r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1));
        return (int) pay;
    }

}
