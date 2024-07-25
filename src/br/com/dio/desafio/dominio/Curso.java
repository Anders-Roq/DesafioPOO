package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    @Override
    public String toString() {
        return "\nCurso:\n" +
                "Titulo: " + titulo + "\n"+
                "Descricao: " + descricao + "\n"+
                "Carga Horaria: " + cargaHoraria + "Hrs" + "\n"+
                "Experiencia: " +calcularXP()
                ;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO*cargaHoraria;
    }
}
