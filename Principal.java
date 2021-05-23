import jdk.javadoc.internal.doclets.toolkit.taglets.SystemPropertyTaglet;

public class Principal {
    public static void main(String[] args) {
        Llave llave1 = new Llave("rojo");
        Puerta puerta1 = new Puerta("rojo");
        Llave llave2 = new Llave("verde");

        System.out.println(puerta1.poner(llave1).abrir());
        puerta1.cerrar();
        System.out.println(puerta1.poner(llave2).abrir());
        puerta1.cerrar();
        System.out.println(puerta1.abrir());
    }
}
