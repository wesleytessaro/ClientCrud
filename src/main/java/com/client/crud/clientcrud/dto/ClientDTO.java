package com.client.crud.clientcrud.dto;

import com.client.crud.clientcrud.entities.Client;
import jakarta.persistence.Column;

import java.io.Serializable;
import java.time.Instant;

public class ClientDTO implements Serializable {
    private Long id;

    private String name;

    private String cpf;

    private Double income;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant birdDate;

    private Integer children;

    public ClientDTO(Long id, String name, String cpf, Double income, Instant birdDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birdDate = birdDate;
        this.children = children;
    }

    public ClientDTO(Client entity){
        this.id=entity.getId();
        this.name= entity.getName();
        this.cpf=entity.getCpf();
        this.income= entity.getIncome();
        this.birdDate=entity.getBirdDate();
        this.children=entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Instant getBirdDate() {
        return birdDate;
    }

    public void setBirdDate(Instant birdDate) {
        this.birdDate = birdDate;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }
}
