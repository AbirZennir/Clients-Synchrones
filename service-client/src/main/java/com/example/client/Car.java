package com.tp.client.model;

public class Car {
    private Long id;
    private String marque;
    private String modele;
    private Long clientId;

    public Car() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }

    public String getModele() { return modele; }
    public void setModele(String modele) { this.modele = modele; }

    public Long getClientId() { return clientId; }
    public void setClientId(Long clientId) { this.clientId = clientId; }
}
