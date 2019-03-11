package model.services;

import model.entity.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServiceImplTest {

    private ServiceImpl service;
    private MobileCompany company;
    private Tariff tariff;
    private Client client;

    @Before
    public void initialization() {
        service = new ServiceImpl();
        company = new MobileCompany("CompanyTest");
        tariff = new CallTariff("TariffTest", 50, 50, 50);
        client = new Client();
    }

    @After
    public void finalization() {
        service = null;
        company = null;
        tariff = null;
        client = null;
    }

    @Test
    public void addTariff() {
        boolean result = service.addTariff(company, tariff);
        Assert.assertTrue(result);
    }

    @Test
    public void addNullTariff() {
        boolean result = service.addTariff(company, null);
        Assert.assertFalse(result);
    }

    @Test
    public void addClient() {
        boolean result = service.addClient(company, client);
        Assert.assertTrue(result);
    }

    @Test
    public void addNullClient() {
        boolean result = service.addClient(company, null);
        Assert.assertFalse(result);
    }

    @Test
    public void countNumberOfClients() {
        service.addClient(company, client);
        int result = service.countNumberOfClients(company);
        Assert.assertEquals(1, result);
    }

    @Test
    public void sortTariffsByFee() {
        service.addTariff(company, new InternetTariff("Tariff", 100, 500));
        service.addTariff(company, tariff);
        service.sortTariffsByFee(company);
        boolean result = company.getTariffs().get(0).getSubscriptionFee() < company.getTariffs().get(1).getSubscriptionFee();
        Assert.assertTrue(result);
    }

    @Test
    public void findTariff() {
        service.addTariff(company, tariff);
        Tariff result = service.findTariff(company, tariff.getSubscriptionFee());
        Assert.assertEquals(result, tariff);
    }
}