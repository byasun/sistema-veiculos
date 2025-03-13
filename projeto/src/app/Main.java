package app;
import Veiculos.Carro;
import Veiculos.Moto;
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Honda", "CB 500", 2023, true);

        carro.exibirInfo();
        System.out.println();
        moto.exibirInfo();
    }
}
