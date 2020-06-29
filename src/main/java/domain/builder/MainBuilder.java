package domain.builder;

public class MainBuilder {
    public Company buildBIgroup(){
        Company c = new Company();
        c.addBlock(new BiGroup());
        return c;
    }

    public Company buildBaziz(){
        Company c = new Company();
        c.addBlock(new Baziz());
        return c;
    }
}
