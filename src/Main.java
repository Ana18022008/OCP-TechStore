public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(
                "123",
                1000.0,
                3,
                "cliente@email.com"
        );

        EstrategiaDeDesconto estrategia = new DescontoAniversario();

        CalculadoraDeDesconto calculadora =
                new CalculadoraDeDesconto(estrategia);

        double valorFinal = calculadora.aplicarDesconto(pedido);

        System.out.println("Valor final: " + valorFinal);
    }
}
