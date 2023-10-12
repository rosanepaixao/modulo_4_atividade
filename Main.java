
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(4, "6", "2023", "Gasolina", "Azul");

      carro.setNumeroDePortas(4);
      carro.setChassi("6");
      carro.setAnoDeFabricacao("2023");
      carro.setCombustivel("Gasolina");
      carro.setCor("Azul");

      System.out.println("Modelos de Carros: ");
      System.out.println(("Numero de Portas: " + carro.getNumeroDePortas()));
      System.out.println(("Chassi: " + carro.getChassi()));
      System.out.println(("Ano de Fabricacao: " + carro.getAnoDeFabricacao()));
      System.out.println(("Combustivel: " + carro.getCombustivel()));
      System.out.println(("Cor: " + carro.getCor()));





    }


}