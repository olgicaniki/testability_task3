public class CreditPaymentService {
    public int calculate(double creditSum, double annualRate, double loanTerm) {
        double monthlyRate = annualRate / 12 / 100;  // месячная ставка по займу
        double growthFactor = Math.pow(1 + monthlyRate, loanTerm); // часть формулы расчета аннуитетного платежа (1 + ПС)ⁿ
        double monthlyPayment = creditSum * monthlyRate * growthFactor / (growthFactor - 1); // формула ЕП = С × ПС × (1 + ПС)ⁿ / ((1 + ПС)ⁿ – 1),
        //где ЕП – размер ежемесячного платежа,
        //С – сумма займа
        //ПС – месячная ставка по займу в долях от единицы, которая вычисляется по формуле: годовая ставка / 12 мес. / 100%,
        //n – срок кредита (в месяцах)
        return (int) monthlyPayment;
    }
}