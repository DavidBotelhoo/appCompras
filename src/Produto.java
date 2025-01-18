public class Produto implements Comparable<Produto> {
    private String nome;
    private double precoProduto;

    public Produto(String nome, double precoProduto) {
        this.nome = nome;
        this.precoProduto = precoProduto;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return this.getNome().compareTo(outroProduto.getNome());
    }
}
