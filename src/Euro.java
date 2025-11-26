public class Euro extends Moeda{
    public Euro(double valor) {
        this.valor = valor;
    }

    @Override
    void info(){
        System.out.println("EURO - " + this.valor * 6);
    }

    @Override
    public double converter(){
        return this.valor * 6;

    }
}
