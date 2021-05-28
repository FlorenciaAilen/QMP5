package ar.edu.utn.frba.dds.QMP.prendas;

public enum TipoPrenda {

    ZAPATO(Categoria.CALZADO),
    CAMISA(Categoria.PARTE_SUPERIOR),
    PANTALON(Categoria.PARTE_INFERIOR);

    Categoria categoria;

    TipoPrenda(Categoria categoria){
        this.categoria = categoria;
    }

    Categoria getCategoria(){
        return categoria;
    }


}
