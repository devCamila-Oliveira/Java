public class Professor extends Funcionario{
    private double adicional;
    private String dedicacao;
    private String titulacao;

    public Professor(String nome, int matricula, String dedicacao){
        super(nome, matricula);
        this.dedicacao = dedicacao;

    }

    public double getAdicional(){

        return adicional;
    }
    public void setAdicional(double adicional) {

        this.adicional = adicional;
    }

    public String getDedicacao(){

        return dedicacao;
    }
    public void setDedicacao(String dedicacao){
        this.dedicacao = dedicacao;
    }
    public String getTitulacao(){
        return titulacao;
    }
    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }

}
