package ar.edu.utn.frba.dds.QMP;

import java.util.*;

public class Guardarropa {
    public Set prendas = new HashSet<Prenda>();
    public Set prendasSugeridas = new HashSet<SugerenciaPrenda>();

    public void agregarPrendaSugerida(Prenda prenda){
        prendasSugeridas.add(new SugerenciaPrenda(prenda));
    }

    public void aceptarSugerencia(SugerenciaPrenda sugerenciaPrenda){
        this.sacarSugerenciaSet(prendasSugeridas,sugerenciaPrenda);
        this.agregarSugerenciaSet(prendas,sugerenciaPrenda);
        this.quieroAceptarSugerencia(true,sugerenciaPrenda);
    }

    public void rechazarSugerencia(SugerenciaPrenda sugerenciaPrenda){
        this.sacarSugerenciaSet(prendasSugeridas,sugerenciaPrenda);
        this.quieroAceptarSugerencia(false,sugerenciaPrenda);

    }

    public void deshacerPrendaAceptada(SugerenciaPrenda sugerenciaPrenda){
        this.sacarSugerenciaSet(prendas,sugerenciaPrenda);
        this.quieroAceptarSugerencia(false,sugerenciaPrenda);

    }

    private void quieroAceptarSugerencia(Boolean bool,SugerenciaPrenda sugerenciaPrenda){
        if (bool) {
            sugerenciaPrenda.aceptarSugerencia();
        } else {
            sugerenciaPrenda.rechazarSugerencia();
        }
    }

    private void sacarSugerenciaSet(Set set,SugerenciaPrenda sugerenciaPrenda){
        set.remove(sugerenciaPrenda);
    }

    private void agregarSugerenciaSet(Set set,SugerenciaPrenda sugerenciaPrenda){
        set.add(sugerenciaPrenda);
    }

    public void agregarPrendas(Prenda prenda){
        prendas.add(prenda);
    }

    //getter

    public Set getPrendas() {
        return prendas;
    }

    public Set getPrendasSugeridas() {
        return prendasSugeridas;
    }

}

