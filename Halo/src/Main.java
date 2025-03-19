public class Main {

    public static void main(String[] args) {

        //Creamos el primer objeto
        Spartan jefemaestro = new Spartan("John",100,70,"Rifle de asalto");

        //invocamos los metodos
        jefemaestro.mostrarInfo();
        jefemaestro.atacar("Grunt");
        jefemaestro.recargarArma(75);
        jefemaestro.correr(true);

        //intento de uso de un metodo Privado
        //jefemaestro.consultaCortana();

        //Usamos get y set para cambiar atributo nombre
        jefemaestro.setNombre("Ivan Isay");
        jefemaestro.mostrarInfo();
        System.out.println(jefemaestro.getNombre());

        //Creamos el segundo objeto
        Spartan reach = new Spartan("Emilie",0,0,"Aguijoneador");

        reach.mostrarInfo();
        reach.atacar("a nadie");
        reach.recargarArma(0);
        reach.correr(false);



    }
}