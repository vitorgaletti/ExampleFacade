
package pojo;

public class Roupa {

    private int id;
    private String descricao;
    private String marca;
    private String tamanho;
    private String cor;
    private int quantidade;
    private double preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
  
    @Override
    public String toString() {
        return "ID: " + id +  "\nDescrição: " + descricao + "\nMarca: " + marca + "\nTamanho: " + tamanho + "\nCor: " + cor + "\nQuantidade: " + quantidade + "\nPreço: " + preco;
    }
        
}
