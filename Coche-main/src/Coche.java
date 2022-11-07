public class Coche {
    //atributos
    public int puertas;//variable para almacenar el numero de puertas

    public Coche(int puertas){//desarrollo
        this.puertas = puertas;
    }
    public Coche(){
    }
    
    public static void main(string[] args) throws exception{//metodos
        int puertas=1;

        Coche miCoche = new Coche();

        //mostrar la cantidad de puertas que el objeto tiene
        System.out.println(Coche.incrementarPuertas( puertas));

    }
    public static int incrementarPuertas(int puertas){//funcion para incrementar el numero de puertas
        int incremento = puertas;
        return puertas;
    }
}
