package model;

public class InstrutorModel {

    private String cpf;
    private String primeiroNome;
    private String nomeMeio;
    private String ultimoNome;
    private String telefone;
    private String especialidade;
    private String horarioTrabalho;

    // Construtor
    public InstrutorModel(
            String cpf,
            String primeiroNome,
            String nomeMeio,
            String ultimoNome,
            String telefone,
            String especialidade,
            String horarioTrabalho) {

        this.cpf = cpf;
        this.primeiroNome = primeiroNome;
        this.nomeMeio = nomeMeio;
        this.ultimoNome = ultimoNome;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.horarioTrabalho = horarioTrabalho;
    }

    // GETTERS
    public String getCpf() { return cpf; }
    public String getPrimeiroNome() { return primeiroNome; }
    public String getNomeMeio() { return nomeMeio; }
    public String getUltimoNome() { return ultimoNome; }
    public String getTelefone() { return telefone; }
    public String getEspecialidade() { return especialidade; }
    public String getHorarioTrabalho() { return horarioTrabalho; }

    // SETTERS
    public void setPrimeiroNome(String primeiroNome) { this.primeiroNome = primeiroNome; }
    public void setNomeMeio(String nomeMeio) { this.nomeMeio = nomeMeio; }
    public void setUltimoNome(String ultimoNome) { this.ultimoNome = ultimoNome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
    public void setHorarioTrabalho(String horarioTrabalho) { this.horarioTrabalho = horarioTrabalho; }

    @Override
    public String toString() {
        return primeiroNome + " " + nomeMeio + " " +  ultimoNome + " - " + cpf + " - " + telefone + " - " + especialidade + " - " + horarioTrabalho ;
    }
}