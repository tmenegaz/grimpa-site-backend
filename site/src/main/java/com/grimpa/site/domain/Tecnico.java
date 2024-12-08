package com.grimpa.site.domain;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Pessoa {
    private List<Processo> processos = new ArrayList<>();


    public Tecnico() {
        super();
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
    }

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }
}
