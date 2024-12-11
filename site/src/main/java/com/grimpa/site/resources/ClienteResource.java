package com.grimpa.site.resources;

import com.grimpa.site.domain.Cliente;
import com.grimpa.site.domain.dtos.ClienteDto;
import com.grimpa.site.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "clientes")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @PostMapping
    public ResponseEntity<ClienteDto> create(@Valid @RequestBody ClienteDto tecnicoDto) {
        Cliente cliente = service.create(tecnicoDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(cliente.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ClienteDto> update(@PathVariable Integer id, @RequestBody ClienteDto tecnicoDto ) {
        Cliente tecnico = service.update(id, tecnicoDto);
        return ResponseEntity.ok().body(new ClienteDto(tecnico));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClienteDto> findById(@PathVariable Integer id) {
        Cliente tecnico = service.findById(id);
        return ResponseEntity.ok().body(new ClienteDto(tecnico));
    }

    @GetMapping
    public ResponseEntity<List<ClienteDto>> findAll() {
        List<Cliente> cliente = service.findAll();
        return ResponseEntity.ok().body(cliente.stream().map(ClienteDto::new).collect(Collectors.toList()));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ClienteDto> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
