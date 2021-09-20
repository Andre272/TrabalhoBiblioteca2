public class Frete {

    // VARIAVEIS
    private int parcelas;
    private String estado;
    
    
    public Frete (int valoParcelas, String valorEstado){
        parcelas = valorParcelas;
        estado = valorEstado;
    }
      
        public void setParcelas(int parcelas) {
            parcelas = valorParcelas;
        }
        public int getParcelas() {
            return parcelas;
        }
        public void setEstado(String estado) {
            estado = valorEstado;
        }
        public String getEstado() {
            return estado;
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