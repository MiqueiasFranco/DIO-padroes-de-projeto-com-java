package com.github.miqueiasfranco.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.github.miqueiasfranco.model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br")

public interface ViaCepService {

    // @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    @GetMapping(value = "/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);

}
