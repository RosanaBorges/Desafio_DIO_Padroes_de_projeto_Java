package one.digitalinnovationsingleton;

public class SinlgetonTitularPreguicosa {

    private static class Titular {
        private static SinlgetonTitularPreguicosa instancia = new SinlgetonTitularPreguicosa();
    }



    private SinlgetonTitularPreguicosa() {
        super();
    }

    public static SinlgetonTitularPreguicosa getInstance(){

        return Titular.instancia;
    }
}
