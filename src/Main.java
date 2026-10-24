public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditSum = 1_000_000;
        double annualRate = 9.99;
        double loanTerm = 12;
        double monthlyPayment = service.calculate(creditSum, annualRate, loanTerm);
        System.out.println("Ваш ежемесячный платёж по кредиту на " + (int) loanTerm + " месяцев: " + monthlyPayment);

        creditSum = 1_000_000;
        annualRate = 9.99;
        loanTerm = 24;
        monthlyPayment = service.calculate(creditSum, annualRate, loanTerm);
        System.out.println("Ваш ежемесячный платёж по кредиту на " + (int) loanTerm + " месяцев: " + monthlyPayment);

        creditSum = 1_000_000;
        annualRate = 9.99;
        loanTerm = 36;
        monthlyPayment = service.calculate(creditSum, annualRate, loanTerm);
        System.out.println("Ваш ежемесячный платёж по кредиту на " + (int) loanTerm + " месяцев: " + monthlyPayment);
    }
}