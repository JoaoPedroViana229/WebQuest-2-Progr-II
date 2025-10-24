public class Caminhao extends Veiculo {
    
    private double capacidadeCarga;
    


    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    
    @Override
    public double calcularIpva() {
        if (capacidadeCarga <= 5) {
            return getValor() * 0.02; 
        } else {
            return getValor() * 0.03; 
        }
    }
}       