package ar.edu.utn.frba.dds.QMP.prendas;

import static ar.edu.utn.frba.dds.QMP.prendas.Trama.LISA;
import static java.util.Objects.requireNonNull;

public class Prenda {
    //atributos primera iteracion
    TipoPrenda tipoPrenda;
    Material material;
    Color color;
    Color colorSecundario;
    //atributos segunda iteracion
    Trama trama = LISA;


    public Prenda(TipoPrenda tipo, Material material, Color color,Trama trama){
        this.tipoPrenda = requireNonNull(tipo, "el tipo de prenda es obligatorio");
        this.material = requireNonNull(material, "el material es obligatorio");
        this.color = requireNonNull(color, "el color es obligatorio");
        this.trama = trama; // cambio de segunda iteracion
    }


    // metodos segunda iteracion

    public Categoria getCategoria(){
        return tipoPrenda.getCategoria();
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public Material getMaterial() {
        return material;
    }

    public Color getColor() {
        return color;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

}
