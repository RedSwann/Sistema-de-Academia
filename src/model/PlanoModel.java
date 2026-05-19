package model;

public class PlanoModel {

    private int planoId;
    private String nome;
    private String descricao;
    private double valor;
    private int duracaoMeses;
    private String beneficios;

    public PlanoModel(int planoId,
                      String nome,
                      String descricao,
                      double valor,
                      int duracaoMeses,
                      String beneficios) {

        this.planoId = planoId;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.duracaoMeses = duracaoMeses;
        this.beneficios = beneficios;
    }


    //getters
    public int getPlanoId() {return planoId;}
    public String getNome() {return nome;}
    public String getDescricao() {return descricao;}
    public double getValor() {return valor;}
    public int getDuracaoMeses() {return duracaoMeses;}
    public String getBeneficios() {return beneficios;}


    //setters
    public void setPlanoId(int planoId) {this.planoId = planoId;}
    public void setNome(String nome) {this.nome = nome;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
    public void setValor(double valor) {this.valor = valor;}
    public void setDuracaoMeses(int duracaoMeses) {this.duracaoMeses = duracaoMeses;}
    public void setBeneficios(String beneficios) {this.beneficios = beneficios;}
    @Override
    public String toString() {
        return "\n|--- PLANO ---|" +
                "\nId: " + planoId +
                "\nNome: " + nome +
                "\nDescrição: " + descricao +
                "\nValor: " + valor +
                "\nDuração em meses: " + duracaoMeses +
                "\nBenefícios:" + beneficios;
    }
}
