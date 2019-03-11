package model.entity;

public class CallTariff extends Tariff {

    private int countOfMinute;
    private int countOfSMS;

    public CallTariff(String name, int subscriptionFee, int countOfMinute, int countOfSMS) {
        super(name, subscriptionFee);
        this.countOfMinute = countOfMinute;
        this.countOfSMS = countOfSMS;
    }

    public int getCountOfMinute() {
        return countOfMinute;
    }

    public void setCountOfMinute(int countOfMinute) {
        this.countOfMinute = countOfMinute;
    }

    public int getCountOfSMS() {
        return countOfSMS;
    }

    public void setCountOfSMS(int countOfSMS) {
        this.countOfSMS = countOfSMS;
    }

    @Override
    public String toString() {
        return "CallTariff{" +
                "name='" + getName() + '\'' +
                ", balance=" + getBalance() +
                ", priceOfMinute=" + getPriceOfMinute() +
                ", priceOfSMS=" + getPriceOfSMS() +
                ", priceOfMegabyte=" + getPriceOfMegabyte() +
                ", subscriptionFee=" + getSubscriptionFee() +
                ", countOfMinute=" + countOfMinute +
                ", countOfSMS=" + countOfSMS +
                '}';
    }
}
