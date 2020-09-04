public class Empregado {
    private String nome;
    private int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;

    public Empregado(double salario2, double bonus2, double comissao2) {
            this.salario = salario;
            this.bonus = bonus;
            this.comissao = comissao;
        }
    }

    public double getBonus() {
        return bonus;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    public double calculaSalario(){
        switch (tipo) {
            case 1:
            return salario;
            case 2: return salario + salario * comissao;
            case 3:
            return salario + bonus;
            default:
            return 0;
        }

     
    }
}
