package one.digitalinnovation.gof.factory;

import java.util.Arrays;

public class FrutasPanetone extends  Panetone{

    protected FrutasPanetone(){
        this.ingredienteList = Arrays.asList(new Ingrediente("acucar","7 colheres de sopa"),new Ingrediente("cacau","5 colheres de sopa"),new Ingrediente("frutas cristalizadas","1 xicara de cafe"));
    }
}
