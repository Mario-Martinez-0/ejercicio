public class Main {

    public static void main(String[] args) {
        int resulta;
        resulta = suma(15, 20, 25);

        System.out.println(resulta);

        Coche puertas = new Coche();
        puertas.sumaPuerta();
        System.out.println(puertas.nPuertas);
    }

    public static int suma(int a, int b, int c){
        int resul = a + b + c;
        return resul;

    }
}

class Coche {

    public int nPuertas = 4;

    public void sumaPuerta(){
        this.nPuertas++;
    }

}