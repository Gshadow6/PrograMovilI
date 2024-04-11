public class PruebaPeluqueria {
    public static void main(String[] args) throws Exception {
        Perro perro01 = new Perro();
        perro01.setNombre("Toby");
        System.out.println(perro01);
        Peluqueria laYayis = new Peluqueria();
        laYayis.CortarPelo(perro01);

        System.out.println(perro01);
    }
}
