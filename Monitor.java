public class Monitor extends Professor {
    private String setor;
    private String turno;

    public Monitor(String nome, int matricula, String dedicacao) {
        super(nome, matricula, dedicacao);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTurno(){
        return turno;
    }
    public void setTurno(String turno){
        this.turno = turno;
    }
}
