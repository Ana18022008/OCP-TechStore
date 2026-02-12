public class DescontoAniversario implements EstrategiaDeDesconto {

    @Override
    public double calcular(Pedido pedido) {
        return pedido.getValorBruto() * 0.80;
    }
}
