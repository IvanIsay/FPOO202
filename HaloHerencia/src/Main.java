public class Main {
    public static void main(String[] args) {

        SpartanII jefemaestro= new SpartanII("Jonh",90,"rifle de asalto",0);
        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("Convenant");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();

        SpartanIII nobleSix = new SpartanIII("Emile",10,"Aguijoneador",0);
        nobleSix.mostrarInfo();
        nobleSix.camuflajeActivo();
        nobleSix.atacar("Grunt");
        nobleSix.recibirDano(100);
        nobleSix.recargarEscudo();


        SpartanIV Locke = new SpartanIV("Locke",70,"DMR",0);




    }
}