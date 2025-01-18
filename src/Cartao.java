import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limiteCartao;
    private List<Produto> listaDeCompras;

    public Cartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean lancaCompra(Produto compras) {
        if (limiteCartao > compras.getPrecoProduto()) {
            limiteCartao -= compras.getPrecoProduto();
            listaDeCompras.add(compras);
            return true;
        }
        return false;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public List<Produto> getListaDeCompras() {
        return listaDeCompras;
    }
}
