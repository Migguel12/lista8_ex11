public class App {
    public static void main(String[] args) throws Exception {
        Carro meuFusca = new Carro(15);
        System.out.println(meuFusca.obterGasolina());
        meuFusca.adicionarGasolina(20);
        System.out.println(meuFusca.obterGasolina());
        meuFusca.andar(100);
        System.out.println(meuFusca.obterGasolina());

        Carro fox = new Carro(10);
        System.out.println(fox.obterGasolina());
        fox.adicionarGasolina(20);
        System.out.println(fox.obterGasolina());
        fox.andar(153);
        System.out.println(fox.obterGasolina());
    }
}
