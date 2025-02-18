public class Main {

    public static void main(String[] args) {

        //Creamos el primer objeto
        Spartan jefemaestro = new Spartan();

        // usamos sus atributos
        jefemaestro.nombre= "John";
        jefemaestro.salud= 100;
        jefemaestro.escudo= 70;
        jefemaestro.armaPrincipal="Rifle de asalto";

        //invocamos los metodos
        jefemaestro.mostrarInfo();
        jefemaestro.atacar("Grunt");
        jefemaestro.recargarArma(75);
        jefemaestro.correr(true);

        //Creamos el segundo objeto
        Spartan reach = new Spartan();
        reach.nombre= "Emilie";
        reach.salud= 0;
        reach.escudo= 0;
        reach.armaPrincipal="Aguijoneador";
        reach.mostrarInfo();
        reach.atacar("a nadie");
        reach.recargarArma(0);
        reach.correr(false);






    }
}