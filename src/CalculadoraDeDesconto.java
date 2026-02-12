public class CalculadoraDeDesconto {

    private EstrategiaDeDesconto estrategia;

    public CalculadoraDeDesconto(EstrategiaDeDesconto estrategia) {
        this.estrategia = estrategia;
    }

    public double aplicarDesconto(Pedido pedido) {
        return estrategia.calcular(pedido);
    }
}
