package com.grimpa.site.services;

import com.grimpa.site.domain.Tecnico;
import com.grimpa.site.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository repository;

    public Tecnico findById(Integer id) {
        Optional<Tecnico> tecnico = repository.findById(id);
        return tecnico.orElse(null);
    }
;}
