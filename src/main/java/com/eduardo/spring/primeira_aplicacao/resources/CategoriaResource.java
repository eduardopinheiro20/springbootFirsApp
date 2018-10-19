package com.eduardo.spring.primeira_aplicacao.resources;

import java.util.List;
import java.util.ArrayList;

import com.eduardo.spring.primeira_aplicacao.domain.Categoria;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource{

    @RequestMapping(method=RequestMethod.GET)
    public List<Categoria> listar() {

        Categoria cat1 = new Categoria(1, "Informatica");
        Categoria cat2 = new Categoria(2, "Escritorio");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);

        return lista;
    }
}