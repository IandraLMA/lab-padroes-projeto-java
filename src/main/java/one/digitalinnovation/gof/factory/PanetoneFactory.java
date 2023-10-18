package one.digitalinnovation.gof.factory;

public class PanetoneFactory {

    private PanetoneFactory(){

    }
    public static Panetone criarPanetoneFruta(){
        return new FrutasPanetone();
    }
    public static Panetone criarPanetoneChocolate(){
        return new ChocolatePanetone();
    }

}
