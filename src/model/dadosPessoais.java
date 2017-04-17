package model;
public class dadosPessoais {
    private String nome;
    private String matricula;
    
    public dadosPessoais (String n, String m){
        this.nome = n;
        this.matricula = m;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
