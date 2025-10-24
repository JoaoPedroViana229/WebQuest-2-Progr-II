public class Moto extends Veiculo {

    private int cilindradas;

    public int getCilindradas(){
        return cilindradas;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularIpva(){
        return getValor() * 0.025;
    }
    
}
