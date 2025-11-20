package gerenciamentoFuncionarios;

public class ControleEstoque {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return (this.salarioBruto * (100 - this.taxa))/100;
    }
    public void aumentarSalario(double percentual){
        this.salarioBruto = (this.salarioBruto * (100 + percentual))/100;
    }
    public void diminuirSalario(double percentual){
        this.salarioBruto = (this.salarioBruto * (100 - percentual))/100;
    }
    public String toString(){
        return nome + " possui um salário bruto de R$ " + salarioBruto + ", com uma taxa de " + taxa + "%" +
                ", assim tendo uma salário líquido de " + salarioLiquido();
    }
}