public class Main {
    public static void main(String[] args) {


        perro p = new perro("mamifero","Perro",2, "croqueta", "labrador");
        System.out.println("el metodos del padre: ");
        p.nacer();
        p.respirar();
        p.comer();
        System.out.println("metedos de interfaz");
        p.bañar();
        p.vacunar();
    }
}
