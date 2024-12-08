package com.grimpa.site.domain;

import com.grimpa.site.domain.enums.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tecnico extends Pessoa {
    @Serial
    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "cliente")
    private List<Processo> processos = new ArrayList<>();


    public Tecnico() {
        super();
        addPerfil(Perfil.TECNICO);
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
        addPerfil(Perfil.TECNICO);
    }

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }
}
