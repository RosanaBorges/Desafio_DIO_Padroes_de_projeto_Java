package one.digitalinnovationsingleton;

import one.digitalinnovationfacade.Facade;
import one.digitalinnovationsingleton.SingletonApressada;
import one.digitalinnovationsingleton.SingletonPreguicosa;
import one.digitalinnovationsingleton.SinlgetonTitularPreguicosa;
import one.digitalinnovationstrategy.*;

public class Teste {
    public static void main(String[] args) {
        SingletonPreguicosa preguicosa = SingletonPreguicosa.getInstance();
        System.out.println(preguicosa);
        preguicosa = SingletonPreguicosa.getInstance();
        System.out.println(preguicosa);

        SingletonApressada apressada = SingletonApressada.getInstance();
        System.out.println(apressada);
        apressada = SingletonApressada.getInstance();
        System.out.println(apressada);

        SinlgetonTitularPreguicosa titularPreguicosa = SinlgetonTitularPreguicosa.getInstance();
        System.out.println(titularPreguicosa);
        titularPreguicosa = SinlgetonTitularPreguicosa.getInstance();
        System.out.println(titularPreguicosa);

        //Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "123456");

    }
}
