package ar.edu.utn.frba.dds.QMP.prendas;

import static java.util.Objects.requireNonNull;

public class Uniforme {
    String ocasionAUtilizar;
    TipoPrenda superior;
    TipoPrenda inferior;
    TipoPrenda calzado;

    public Uniforme(TipoPrenda superior, TipoPrenda inferior, TipoPrenda calzado,String ocasionAUtilizar){
        this.superior = requireNonNull(superior,"Tiene que cargar una prenda superior");
        this.inferior = requireNonNull(inferior,"Tiene que cargar una prenda inferior");
        this.calzado = requireNonNull(calzado,"Tiene que cargar un calzado");
        this.ocasionAUtilizar = ocasionAUtilizar;
    }
}
