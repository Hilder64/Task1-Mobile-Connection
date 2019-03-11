package model.entity;

import java.util.Objects;

public abstract class Tariff {

    private String name;
    private int balance;
    private double priceOfMinute;
    private double priceOfSMS;
    private double priceOfMegabyte;
    private int subscriptionFee;

    public Tariff(String name, int subscriptionFee) {
        this.name = name;
        this.balance = 0;
        this.priceOfMinute = 0.5;
        this.priceOfSMS = 1;
        this.priceOfMegabyte = 0.05;
        this.subscriptionFee = subscriptionFee;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getPriceOfMinute() {
        return priceOfMinute;
    }

    public void setPriceOfMinute(double priceOfMinute) {
        this.priceOfMinute = priceOfMinute;
    }

    public double getPriceOfSMS() {
        return priceOfSMS;
    }

    public void setPriceOfSMS(double priceOfSMS) {
        this.priceOfSMS = priceOfSMS;
    }

    public double getPriceOfMegabyte() {
        return priceOfMegabyte;
    }

    public void setPriceOfMegabyte(double priceOfMegabyte) {
        this.priceOfMegabyte = priceOfMegabyte;
    }

    public int getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(int subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tariff tariff = (Tariff) o;
        return balance == tariff.balance &&
                Double.compare(tariff.priceOfMinute, priceOfMinute) == 0 &&
                Double.compare(tariff.priceOfSMS, priceOfSMS) == 0 &&
                Double.compare(tariff.priceOfMegabyte, priceOfMegabyte) == 0 &&
                subscriptionFee == tariff.subscriptionFee &&
                Objects.equals(name, tariff.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance, priceOfMinute, priceOfSMS, priceOfMegabyte, subscriptionFee);
    }
}
