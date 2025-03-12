package veiculos;
public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean partidaEletrica) {
        super(marca, modelo, ano);
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Possui partida elétrica: " + (partidaEletrica ? "Sim" : "Não"));
    }
}