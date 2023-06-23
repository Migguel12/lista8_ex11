public class Carro {
    private double km;
    private double litro;
    double consumo = km/litro;
    double combustivelNoTanque = 0;

    
    public Carro(double consumo){
        this.consumo = consumo;
    }

    public void adicionarGasolina(double colocarGasolina){
        combustivelNoTanque = colocarGasolina;        
    }

    public void andar(double quantidadePercorrida){
        combustivelNoTanque = combustivelNoTanque -  (quantidadePercorrida/consumo) ;
    }

    public double obterGasolina(){
        return combustivelNoTanque;
    }
}
