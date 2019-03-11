package model.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MobileCompany extends Company {

    private List<Tariff> tariffs;

    public MobileCompany(String name) {
        super(name);
        this.tariffs = new ArrayList<Tariff>() {
            @Override
            public String toString() {
                Iterator<Tariff> it = iterator();
                if (!it.hasNext())
                    return "List is empty. Nothing found";

                StringBuilder sb = new StringBuilder();
                for (; ; ) {
                    Tariff e = it.next();
                    sb.append(e);
                    if (!it.hasNext())
                        return sb.toString();
                    sb.append('\n');
                }
            }
        };
    }

    public List<Tariff> getTariffs() {
        return tariffs;
    }

    public void setTariffs(List<Tariff> tariffs) {
        this.tariffs = tariffs;
    }
}
