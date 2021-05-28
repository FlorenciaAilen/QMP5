package ar.edu.utn.frba.dds.QMP.administrador;

import ar.edu.utn.frba.dds.QMP.prendas.TipoPrenda;
import ar.edu.utn.frba.dds.QMP.prendas.Uniforme;

public class Administrador {

    void configurarUniformes(TipoPrenda superior, TipoPrenda inferior, TipoPrenda calzado, String ocasionAUtilizar){

        new Uniforme(superior,inferior,calzado,ocasionAUtilizar);
        // TODO: 29/04/2021
    }
}
