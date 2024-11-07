package com.algaworks.algatransito.api.controller;

import com.algaworks.algatransito.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> list() {
        var proprietario1 = new Proprietario();
        proprietario1.setId(1L);
        proprietario1.setName("Filipe");
        proprietario1.setEmail("filipe@gmail.com");
        proprietario1.setTelefone("61 99367-9805");

        var proprietario2 = new Proprietario();
        proprietario2.setId(2L);
        proprietario2.setName("Gustavo");
        proprietario2.setEmail("gustavo@gmail.com");
        proprietario2.setTelefone("61 98537-9949");

        return Arrays.asList(proprietario1, proprietario2);

    }
}
