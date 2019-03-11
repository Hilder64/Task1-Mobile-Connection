package model.services;

import model.entity.Client;
import model.entity.MobileCompany;
import model.entity.Tariff;

public interface Service {

    boolean addTariff(MobileCompany company, Tariff tariff);

    boolean addClient(MobileCompany company, Client client);

    int countNumberOfClients(MobileCompany company);

    boolean sortTariffsByFee(MobileCompany company);

    Tariff findTariff(MobileCompany company, int subscriptionFee);
}
