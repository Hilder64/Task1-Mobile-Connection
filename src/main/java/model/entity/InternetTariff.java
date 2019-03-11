package model.entity;

public class InternetTariff extends Tariff {

    private int countOfMegabytes;

    public InternetTariff(String name, int subscriptionFee, int countOfMegabytes) {
        super(name, subscriptionFee);
        this.countOfMegabytes = countOfMegabytes;
    }

    public int getCountOfMegabytes() {
        return countOfMegabytes;
    }

    public void setCountOfMegabytes(int countOfMegabytes) {
        this.countOfMegabytes = countOfMegabytes;
    }

    @Override
    public String toString() {
        return "InternetTariff{" +
                "name='" + getName() + '\'' +
                ", balance=" + getBalance() +
                ", priceOfMinute=" + getPriceOfMinute() +
                ", priceOfSMS=" + getPriceOfSMS() +
                ", priceOfMegabyte=" + getPriceOfMegabyte() +
                ", subscriptionFee=" + getSubscriptionFee() +
                ", countOfMegabytes=" + countOfMegabytes +
                '}';
    }
}
