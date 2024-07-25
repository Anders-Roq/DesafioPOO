package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    protected LocalDate Data;

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }

    public Mentoria(){

    }

    @Override
    public String toString() {
        return "\nMentoria: \n" +
                "Titulo: " + titulo + "\n"+
                "Descricao: " + descricao + "\n" +
                "Data: " + Data + "\n"+
                "Experiencia: " +calcularXP()
                ;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO+20;
    }
}
