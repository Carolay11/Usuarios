package com.servicios.CaroTest11042023.Controller;

import com.servicios.CaroTest11042023.Service.ServicioMatematica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TodoController {

    @Autowired
    private ServicioMatematica servicioMatematica;

    @GetMapping
    public String holaMundo() {
        return "Hola Mundo!!";
    }


    @GetMapping(value = "/raiz/{a}")
    public Double calcularRaizCuadrada(@PathVariable(name = "a") Integer numeroA) {
        return servicioMatematica.calcularRaizCuadrada(numeroA);
    }

    @GetMapping(value = "multiplicar")
    public Double multiplicar(@RequestParam(name = "numero1") Integer numero1,
                              @RequestParam(name = "numero2") Integer numero2) {
        return servicioMatematica.multiplicar(numero1, numero2);
    }

    @GetMapping(value = "dividir")
    public Double dividir(@RequestParam(name = "numero1") Integer numero1,
                          @RequestParam(name = "numero2") Integer numero2) {
        return servicioMatematica.dividir(numero1, numero2);
    }

    @GetMapping(value = "mayor")
    public Integer mayor(@RequestParam(name = "numeroA") Integer numeroA,
                        @RequestParam(name = "numeroB") Integer numeroB,
                        @RequestParam(name = "numeroC") Integer numeroC){
        return servicioMatematica.mayor(numeroA,numeroB,numeroC);
    }

    @GetMapping(value = "menor")
    public Integer menor(@RequestParam(name = "numeroa") Integer numeroa,
                         @RequestParam(name = "numerob") Integer numerob,
                         @RequestParam(name = "numeroc") Integer numeroc){
        return servicioMatematica.menor(numeroa,numerob,numeroc);
    }
}
