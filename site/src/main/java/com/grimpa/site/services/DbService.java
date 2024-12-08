package com.grimpa.site.services;

import com.grimpa.site.domain.Cliente;
import com.grimpa.site.domain.Processo;
import com.grimpa.site.domain.Tecnico;
import com.grimpa.site.domain.enums.Modalidade;
import com.grimpa.site.domain.enums.Perfil;
import com.grimpa.site.domain.enums.Status;
import com.grimpa.site.repositories.ClienteRepository;
import com.grimpa.site.repositories.ProcessoRepository;
import com.grimpa.site.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DbService {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProcessoRepository processoRepository;

    public void startDbH2() {
        Tecnico tecAdmin = new Tecnico(null, "Tiago Menegaz", "02150062917", "tmenegaz77@gmail.com", "280577T@m");
        tecAdmin.addPerfil(Perfil.ADMIN);

        Cliente clienteLPA = new Cliente(null, "Letícia Azevedo", "568.063.720-07", "leticiapazevedo@gmail.com", "123");

        Processo processoBallet = new Processo(null, Modalidade.BALLET, Status.ATIVO, "Treinamento intermediário", "Escola Studio de Dança", clienteLPA, tecAdmin);

        tecnicoRepository.saveAll(Arrays.asList(tecAdmin));
        clienteRepository.saveAll(Arrays.asList(clienteLPA));
        processoRepository.saveAll(Arrays.asList(processoBallet));
    }
}
