public class Dolar extends Moeda{

    public Dolar(double valor) {
        this.valor = valor;
    }

    @Override
    void info(){
        System.out.println("DOLAR - " + this.valor * 5);
    }

    @Override
    public double converter(){
    return this.valor * 5;

    }
}
