public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado(3231,23713,3423);
        Empregado emp2 = new Empregado(34,2553,12312);
        Empregado emp3 = new Empregado(37123,112,31);
    System.out.println(emp1.calculaSalario() + " " + emp2.calculaSalario() + " " + emp3.calculaSalario());
    }
}