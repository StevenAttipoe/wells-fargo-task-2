package com.wellsfargo.counselor.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    private Client client;

    @JsonIgnore
    @OneToMany(mappedBy="portfolio", cascade = CascadeType.ALL)
    private List<Security> securities;

    @Column(nullable = false)
    private LocalDate creationData;

    public Portfolio() {
    }

    public Portfolio(long portfolioId, Client client, LocalDate creationData) {
        this.portfolioId = portfolioId;
        this.client = client;
        this.creationData = creationData;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreationData() {
        return creationData;
    }

    public void setCreationData(LocalDate creationData) {
        this.creationData = creationData;
    }
}
