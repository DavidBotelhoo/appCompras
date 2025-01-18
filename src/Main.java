import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner receber = new Scanner(System.in);
        
        System.out.println("Digite o limite do cartão:");
        double limiteCartao = receber.nextDouble();
        Cartao cartao = new Cartao(limiteCartao);

        int opcao = 1;
        while (opcao != 0 && limiteCartao != 0) {

            System.out.println("Descrição da compra:");
            String compras = receber.next();

            System.out.println("Valor da compra:");
            double precoProduto = receber.nextDouble();
            Produto produto = new Produto(compras, precoProduto);
            boolean compraFeita = cartao.lancaCompra(produto);

            if (compraFeita) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                opcao = receber.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                opcao = 0;
            }
        }

        System.out.println("*******************");
        System.out.println("Compras realizadas:");
        System.out.println();
        cartao.getListaDeCompras().sort(Comparator.comparing(Produto::getPrecoProduto));
        if (cartao.getListaDeCompras().isEmpty()) {
            System.out.println("Nenhuma Compra realizada.");
        }
        for (Produto item : cartao.getListaDeCompras()) {
            System.out.println(item.getNome() + " - R$" + item.getPrecoProduto());
        }
        System.out.println();
        System.out.println("*******************");
        System.out.println("\nLimite disponivel no cartão: R$" + cartao.getLimiteCartao());
    }
}