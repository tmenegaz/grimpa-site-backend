package com.grimpa.site.domain;

import com.grimpa.site.domain.enums.Modalidade;
import com.grimpa.site.domain.enums.Status;

import java.time.LocalDate;
import java.util.Objects;

public class Processo {

    private Integer id;
    private LocalDate dataInicio = LocalDate.now();
    private LocalDate dataFim;
    private Modalidade modalidade;
    private Status status;
    private String titulo;
    private String observacao;

    private Cliente cliente;
    private Tecnico tecnico;

    public Processo() {
        super();
    }

    public Processo(Integer id, Modalidade modalidade, Status status, String titulo, String observacao, Cliente cliente, Tecnico tecnico) {
        this.id = id;
        this.modalidade = modalidade;
        this.status = status;
        this.titulo = titulo;
        this.observacao = observacao;
        this.cliente = cliente;
        this.tecnico = tecnico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Processo processo)) return false;
        return Objects.equals(getId(), processo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
