package model.entity;

public abstract class Company {

    private int countOfClients;
    private String name;

    public Company(String name) {
        this.name = name;
        this.countOfClients = 0;
    }

    public int getCountOfClients() {
        return countOfClients;
    }

    public void setCountOfClients(int countOfClients) {
        this.countOfClients = countOfClients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
