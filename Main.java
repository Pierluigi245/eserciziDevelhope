public class Main {
    public static void main(String[] args) {

        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo( 10.0 ,  12.0);
        forma.calcolaArea();
        rettangolo.calcolaArea();
    }
}
 class Forma {
    public void calcolaArea () {

        System.out.println("Area rettangolo = ");
    }
}

class Rettangolo extends Forma {
    private double lunghezza;
    private double larghezza;

    @Override
    public void calcolaArea() {
        double area = lunghezza * larghezza;
        System.out.println("Area rettangolo = " + area);
    }

    public Rettangolo(double lunghezza, double larghezza){
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;



        }

    }
