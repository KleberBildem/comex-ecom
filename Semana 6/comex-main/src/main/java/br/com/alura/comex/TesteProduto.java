package br.com.alura.comex;

public class  TesteProduto {

    public static void main(String[] args) {

        System.out.println("TEste de produto");

        Produto celular = new Produto();
        celular.nome = "Samsung S21";
        celular.descricao = "Android com 512GB";
        celular.quantidade = 10;
        celular.precoUnitario = 4800.00;

        System.out.println(celular);
    }
}
