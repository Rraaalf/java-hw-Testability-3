public class CreditPaymentService {
    public int calculate(int amountOfCredit, int creditTermInYears, double interestRateYear){
        int creditTermInMonths = creditTermInYears * 12;
        double interestRateMonth = interestRateYear / 100 / 12;
        double K = (interestRateMonth * Math.pow((1 + interestRateMonth), creditTermInMonths)) / (Math.pow((1 + interestRateMonth), creditTermInMonths) - 1);
        return (int) (amountOfCredit * K);
    }
}
