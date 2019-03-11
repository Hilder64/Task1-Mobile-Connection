package model.services;

import model.entity.Client;
import model.entity.Company;
import model.entity.MobileCompany;
import model.entity.Tariff;

import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class ServiceImpl implements Service {

    private Optional<MobileCompany> companyOptional;
    private Optional<? extends Tariff> tariffOptional;
    private Optional<Client> clientOptional;

    public boolean addTariff(MobileCompany company, Tariff tariff) {
        setCompanyOptional(company);
        setTariffOptional(tariff);
        if (companyOptional.isPresent() && tariffOptional.isPresent()) {
            companyOptional.get().getTariffs().add(tariffOptional.get());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean addClient(MobileCompany company, Client client) {
        setCompanyOptional(company);
        setClientOptional(client);
        if (companyOptional.isPresent() &&  clientOptional.isPresent()) {
            companyOptional.get().setCountOfClients(companyOptional.get().getCountOfClients() + 1);
            return true;
        } else {
            return false;
        }
    }

    public int countNumberOfClients(MobileCompany company) {
        setCompanyOptional(company);
        return companyOptional.map(Company::getCountOfClients).orElse(0);
    }

    public boolean sortTariffsByFee(MobileCompany company) {
        setCompanyOptional(company);
        if (companyOptional.isPresent()) {
            companyOptional.get().getTariffs().sort((Comparator.comparingInt(Tariff::getSubscriptionFee)));
            return true;
        } else {
            return false;
        }
    }

    public Tariff findTariff(MobileCompany company, int subscriptionFee) {
        setCompanyOptional(company);
        if (companyOptional.isPresent()) {
            for (Tariff t : companyOptional.get().getTariffs()) {
                if (t.getSubscriptionFee() == subscriptionFee) {
                    return t;
                }
            }
        }
        return null;
    }

    private void setCompanyOptional(MobileCompany company) {
        this.companyOptional = Optional.ofNullable(company);
    }

    private void setTariffOptional(Tariff tariff) {
        this.tariffOptional = Optional.ofNullable(tariff);
    }

    private void setClientOptional(Client client) {
        this.clientOptional = Optional.ofNullable(client);
    }
}
