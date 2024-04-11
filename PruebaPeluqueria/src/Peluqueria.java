public class Peluqueria {
    public void CortarPelo(Perro p){
        if (p.getPelo()==true){
            p.setPelo(false);
            System.out.println("El "+ p.getNombre() +" is pelon");
        } else {
            System.out.println("El "+ p.getNombre() +" is pelon't");
        }
        
    }
    
}
