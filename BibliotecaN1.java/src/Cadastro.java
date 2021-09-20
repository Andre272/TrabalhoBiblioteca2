public class Cadastro {

// VARIAVEIS
private String nome, cpf;


public Cadastro  (String valorNome, String valorCpf){
    nome = valorNome;
    cpf = valorCpf;

}

public void setNome(String valorNome) {
        nome = valorNome;
    }
    public String getNome() {
        return nome;
    }
    public void setCpf(String valorCpf) {
        cpf = valorCpf;
    }
    public String getCpf() {
        return cpf;
    }

    public String toString() {
        return this.nome + "\n" + 
               this.cpf + "\n" + 
               this.parcelas + "\n" +
               this.valor + "\n" +
               this.opcao + "\n" +
               this.pular + "\n" +
               this.estado + "\n" +
               this.frete + "\n" +
               this.resultado;

    }
}