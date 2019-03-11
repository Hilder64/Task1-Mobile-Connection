package controller;

import model.database.MobileCompanies;
import model.database.Tariffs;
import model.entity.Client;
import model.entity.MobileCompany;
import model.services.Service;
import model.services.ServiceImpl;
import view.View;

import static view.TextConstants.*;

public class Controller {

    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void processUser() {

        Service service = new ServiceImpl();
        MobileCompany company = MobileCompanies.valueOf("KYIVSTAR").getCompany();

        addTariffs(service, company);//add some tariffs to  company
        addClients(service, company, 12);

        view.printStringInput(NUMBER_OF_CLIENTS);
        view.printMessage(String.valueOf(service.countNumberOfClients(company)));

        view.printStringInput(COMPANY_TARIFFS);
        view.printMessage(company.getTariffs().toString());

        service.sortTariffsByFee(company);
        view.printStringInput(SORTED_COMPANY_TARIFFS);
        view.printMessage(company.getTariffs().toString());

        view.printStringInput(SEARCH_RESULT);
        view.printMessage(String.valueOf(service.findTariff(company, 100)));
    }

    private void addTariffs(Service service, MobileCompany company) {
        for (Tariffs t : Tariffs.values()) {
            service.addTariff(company, t.getTariff());
        }
    }

    private void addClients(Service service, MobileCompany company, int numberOfClients) {
        for (;numberOfClients > 0; numberOfClients--) {
            service.addClient(company, new Client());
        }
    }
}
