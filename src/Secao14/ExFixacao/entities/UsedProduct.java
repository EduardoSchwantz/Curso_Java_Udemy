package Secao14.ExFixacao.entities;

import java.util.Date;

public class UsedProduct extends Product {
    private Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String priceTag() {
        return super.getName() + " (used) " + "$ " +
                String.format("%.2f", super.getPrice()) +
                "(Manufacture date: " + this.manufactureDate + ")";
    }
}