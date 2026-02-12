public class DescontoVIP implements EstrategiaDeDesconto {

    @Override
    public double calcular(Pedido pedido) {
        return pedido.getValorBruto() * 0.85;
    }
}
