package one.digitalinnovationsingleton;

public class SingletonApressada {
    private static SingletonApressada instacia = new SingletonApressada();

    private SingletonApressada ( ){
        super();
    }

    public static SingletonApressada getInstance(){
        return instacia;
    }
}
