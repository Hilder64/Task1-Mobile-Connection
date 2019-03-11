package model.database;

import model.entity.MobileCompany;

public enum MobileCompanies {
    KYIVSTAR(new MobileCompany("KYIVSTAR".toLowerCase())),
    VODAFONE(new MobileCompany("VODAFONE".toLowerCase())),
    LIFECELL(new MobileCompany("LIFECELL".toLowerCase()));

    private MobileCompany company;

    MobileCompanies(MobileCompany company) {
        this.company = company;
    }

    public MobileCompany getCompany() {
        return company;
    }
}
