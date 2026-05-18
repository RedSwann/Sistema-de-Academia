package model;

public class AlunoModel {
    private String cpf;
    private String primeiroNome;
    private String nomeMeio;
    private String ultimoNome;
    private String telefone;
    private String dataNascimento;
    private String email;
    private String dataMatricula;
    private String plano;


    public AlunoModel(
            String cpf,
            String primeiroNome,
            String nomeMeio,
            String ultimoNome,
            String telefone,
            String email,
            String dataNascimento,
            String dataMatricula,
            String plano) {
        this.cpf = cpf;
        this.primeiroNome = primeiroNome;
        this.nomeMeio = nomeMeio;
        this.ultimoNome = ultimoNome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.dataMatricula = dataMatricula;
        this.plano = plano;
    }

    //Getters
    public String getCpf() { return cpf; }
    public String getPrimeiroNome() { return primeiroNome; }
    public String getNomeMeio() { return nomeMeio; }
    public String getUltimoNome() { return ultimoNome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getDataNascimento() { return dataNascimento; }
    public String getDataMatricula() { return dataMatricula; }
    public String getPlano() { return plano; }

    //Setters
    public void setPrimeiroNome(String primeiroNome) { this.primeiroNome = primeiroNome; }
    public void setNomeMeio(String nomeMeio) { this.nomeMeio = nomeMeio; }
    public void setUltimoNome(String ultimoNome) { this.ultimoNome = ultimoNome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEmail(String email) { this.email = email; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
    public void setDataMatricula(String dataMatricula) { this.dataMatricula = dataMatricula; }
    public void setPlano(String plano) { this.plano = plano; }

    @Override
    public String toString() {
        return primeiroNome + " " + nomeMeio + " " +  ultimoNome + " - " + cpf + " - " + telefone + " - " + email + " - " + dataNascimento + " - " + dataMatricula + " - " + plano;
    }
}
