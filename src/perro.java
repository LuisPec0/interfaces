public class perro extends Animal implements mascotas  {



    private int edad;
    private String nombrePerro;
    private String  raza;

    public perro(String tipo, String nombre, int edad, String nombre1, String raza) {
        super(tipo, nombre);
        this.edad = edad;
        this.nombrePerro = nombre1;
        this.raza = raza;
    }

    @Override
    public void bañar() {
        System.out.println("bañando a: "+this.nombrePerro);

    }

    @Override
    public void vacunar() {
        System.out.println("el perro a vacunar es: "+this.nombrePerro);

    }

    @Override
    public void guarderia() {

    }

    @Override
    public void comer() {
        System.out.println("el perro come sentado");

    }

    @Override
    public void respirar() {
        System.out.println("el perro respira como los mamiferos");

    }


}
