public class Produtos {
    
    // aqui cria os atributos para produtos.

    private int idProduto;
    private String nomeProduto;
    private double valorProduto;

    // cria o construtor para produtos.

    public Produtos (int idProduto, String nomeProduto, double valorProduto){
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    // getters (adicionar)
    public int getIdProduto() {
        return idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    // setters (alterar)
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    // métodos

    public void exibirDados(){
        System.out.println("ID: "+idProduto+", Nome do produto: "+nomeProduto+" e valor: R$"+valorProduto+"");
    }


}
