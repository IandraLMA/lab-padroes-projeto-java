package one.digitalinnovation.gof.factory;

import java.util.Arrays;
import java.util.List;

public class ChocolatePanetone extends Panetone{

    protected ChocolatePanetone(){
        this.ingredienteList = Arrays.asList(new Ingrediente("acucar","1 colher"),new Ingrediente("cacau","5 colheres"));
    }
}
