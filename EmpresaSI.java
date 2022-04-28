public class EmpresaSI {
    public static void main(String[] args) {
        Professor prof = new Professor("Ackley", 3232,"Integral");

        Monitor monitor = new Monitor("Camila", 3123, "Noturno");

        System.out.println("\nProfessor");
        System.out.println("Nome: " + prof.getNome());
        System.out.println("Dedicção: " + prof.getDedicacao());
        System.out.println("Adicional: " + prof.getAdicional());
        System.out.println("\nMonitor");
        System.out.println("Nome: " + monitor.getNome());
        System.out.println("Matricula:" + monitor.getMatricula());
        System.out.println("Turno:" + monitor.getDedicacao());
    }
}
