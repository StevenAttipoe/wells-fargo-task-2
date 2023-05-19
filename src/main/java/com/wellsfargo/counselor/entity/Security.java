package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @JoinColumn(name = "portfolio_id", referencedColumnName = "portfolio_id")
    private Portfolio  portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String categpry;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private int quantity;

    public Security() {
    }

    public Security(long securityId, Portfolio portfolio, String name, String categpry, double purchasePrice, LocalDate purchaseDate, int quantity) {
        this.securityId = securityId;
        this.portfolio = portfolio;
        this.name = name;
        this.categpry = categpry;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategpry() {
        return categpry;
    }

    public void setCategpry(String categpry) {
        this.categpry = categpry;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
