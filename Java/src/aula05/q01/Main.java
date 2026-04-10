package aula05.q01;

public class Main {
    public static void main(String[] args) {
        ClinicoGeral clinico = new ClinicoGeral();
        clinico.trabalhaNoHospital = true;
        clinico.atendeEmCasa = true;
        clinico.tratarPaciente();
        clinico.receitar();

        Cirurgiao cirurgiao = new Cirurgiao();
        cirurgiao.trabalhaNoHospital = true;
        cirurgiao.tratarPaciente();
        cirurgiao.fazerIncisao();
    }
}