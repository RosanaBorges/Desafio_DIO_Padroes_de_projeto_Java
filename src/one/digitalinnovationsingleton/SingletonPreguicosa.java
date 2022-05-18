package one.digitalinnovationsingleton;

public class SingletonPreguicosa {

        private static SingletonPreguicosa instancia;

        private SingletonPreguicosa() {
            super();
        }

        public static SingletonPreguicosa getInstance(){
            if (instancia == null){
                instancia = new SingletonPreguicosa();
            }
            return instancia;
        }
    }

