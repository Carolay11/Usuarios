package com.servicios.CaroTest11042023.Service;

import org.springframework.stereotype.Service;

@Service
public class ServicioMatematicaImpl implements ServicioMatematica {

    @Override
    public Double calcularRaizCuadrada(Integer numeroA) {
        return Math.sqrt(numeroA);
    }

    @Override
    public Double multiplicar(Integer numero1, Integer numero2) {
        return new Double(numero1 * numero2);
    }

    @Override
    public Double dividir(Integer numero1, Integer numero2) {
        return new Double(numero1 / numero2);
    }

    @Override
    public Integer mayor(Integer numeroA, Integer numeroB, Integer numeroC) {
        if (numeroA > numeroB && numeroA > numeroC) {
            return numeroA;
        }
        if (numeroB > numeroA && numeroB > numeroC) {
            return numeroB;
        }
        if (numeroC > numeroB && numeroC > numeroA) {
            return numeroC;
        }

        return null;

    }

    @Override
    public Integer menor(Integer numeroa, Integer numerob, Integer numeroc) {
        if (numeroa < numerob) {
            if (numeroa < numeroc) {
                return numeroa;
            } else {
                return numeroc;
            }
        } else if (numerob < numeroc) {
            return numerob;
        } else {
            return numeroc;
        }

    }

}
