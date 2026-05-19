package model;

public class AulaModel {
    private int aulaId;
    private String nome;
    private String descricao;
    private String horario;
    private int capacidade;
    private String duracao;
    private String insCpf;



    public AulaModel(
            int aulaId,
            String nome,
            String descricao,
            String horario,
            int capacidade,
            String duracao,
            String insCpf
            ) {
        this.aulaId  = aulaId;
        this.nome = nome;
        this.descricao = descricao;
        this.horario = horario;
        this.capacidade = capacidade;
        this.duracao = duracao;
        this.insCpf = insCpf;

    }

    //Getters
    public int getAulaId() { return aulaId; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public String getHorario() { return horario; }
    public int getCapacidade() { return capacidade; }
    public String getDuracao() { return duracao; }
    public String getInsCpf() { return insCpf; }


    //Setters
    public void setAulaId(int aulaId) { this.aulaId = aulaId; }
    public void setNome(String nome) { this.nome = nome; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setHorario(String horario) { this.horario = horario; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }
    public void setDuracao(String duracao) { this.duracao = duracao; }
    public void setInsCpf(String insCpf) { this.insCpf = insCpf; }

    @Override
    public String toString() {
        return aulaId + " - "
                + nome + " - "
                + descricao + " - "
                + horario + " - "
                + capacidade + " vagas - "
                + duracao + " - Instrutor: "
                + insCpf;
    }
}
