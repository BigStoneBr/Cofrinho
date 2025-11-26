public class Real extends Moeda{
    public Real(double valor) {
        this.valor = valor;
    }
    @Override
    void info(){
        System.out.println("REAL - " + this.valor);
    }
    @Override
    public double converter(){
        return this.valor;

    }
}
