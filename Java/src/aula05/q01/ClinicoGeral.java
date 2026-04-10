package aula05.q01;

public class ClinicoGeral extends Medico {
    public boolean atendeEmCasa;

    public void receitar() {
        System.out.println("Clínico Geral receitando medicamento.");
    }

    @Override
    public void tratarPaciente() {
        System.out.println("Clínico Geral tratando paciente.");
    }
}