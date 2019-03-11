package model.database;

import model.entity.CallTariff;
import model.entity.InternetTariff;
import model.entity.Tariff;

public enum Tariffs {
    TALKING_STANDARD(new CallTariff("TALKING_STANDARD",40, 60, 60)),
    TALKING_PREMIUM(new CallTariff("TALKING_PREMIUM",100, 200, 200)),
    ECONOMY(new CallTariff("ECONOMY", 25, 20, 20)),
    INTERNET_STANDARD(new InternetTariff("INTERNET_STANDARD",70, 5000)),
    INTERNET_PREMIUM(new InternetTariff("INTERNET_PREMIUM",150, 30000));

    private Tariff tariff;

    Tariffs(Tariff tariff) {
        this.tariff = tariff;
    }

    public Tariff getTariff() {
        return tariff;
    }
}
