package model;

public class InstrutorModel {

    private String cpf;
    private String nome;
    private String telefone;
    private String especialidade;
    private String horarioTrabalho;

    // Construtor
    public InstrutorModel(String cpf, String nome, String telefone,
                          String especialidade, String horarioTrabalho) {

        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.horarioTrabalho = horarioTrabalho;
    }

    // GETTERS
    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEspecialidade() { return especialidade; }
    public String getHorarioTrabalho() { return horarioTrabalho; }

    // SETTERS
    public void setNome(String nome) { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
    public void setHorarioTrabalho(String horarioTrabalho) { this.horarioTrabalho = horarioTrabalho; }

    @Override
    public String toString() {
        return nome + " - " + cpf + " - " + telefone + " - " + especialidade + " - " + horarioTrabalho ;
    }
}