package org.bfchallenge.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String nomClient;
    private String addresseClient;
    private String emailClient;
    private String telClient;
    @OneToMany(mappedBy = "client")
    private Collection<Commande> commandes;

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getAddresseClient() {
        return addresseClient;
    }

    public void setAddresseClient(String addresseClient) {
        this.addresseClient = addresseClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getTelClient() {
        return telClient;
    }

    public void setTelClient(String telClient) {
        this.telClient = telClient;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }

    public Client(String nomClient, String addresseClient, String emailClient, String telClient) {
        this.nomClient = nomClient;
        this.addresseClient = addresseClient;
        this.emailClient = emailClient;
        this.telClient = telClient;
    }

    public Client() {
        super();
    }
}
