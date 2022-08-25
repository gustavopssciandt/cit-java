import java.time.LocalDate;

public class ContaBancaria {

    private String nomeTitular;
    private Integer numero;
    private String agencia;
    private Double saldo;
    private LocalDate dataAbertura;


    public Double saque(String valorSaque){
        return saldo = saldo - Double.valueOf(valorSaque);
    }

    public Double deposito(String valorDeposito){
        return saldo = saldo + Double.valueOf(valorDeposito);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
