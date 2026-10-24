public class CreditPaymentService {
    public int calculate(double creditSum, double annualRate, double loanTerm) {
        double monthlyRate = annualRate / 12 / 100;  // месячная ставка по займу
        double growthFactor = Math.pow(1 + monthlyRate, loanTerm); // часть формулы расчета аннуитетного платежа (1 + ПС)ⁿ
        double monthlyPayment = creditSum * monthlyRate * growthFactor / (growthFactor - (double) 1); // формула ЕП = С × ПС × (1 + ПС)ⁿ / ((1 + ПС)ⁿ – 1)
        return (int) monthlyPayment;
    }
}