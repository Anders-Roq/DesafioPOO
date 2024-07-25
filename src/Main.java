import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();
        Bootcamp bootcamp = new Bootcamp();

        curso1.setTitulo("Java");
        curso1.setDescricao("Entender como Java Funciona");
        curso1.setCargaHoraria(36);

        curso2.setTitulo("Phyton");
        curso2.setDescricao("Entender como Phyton Funciona");
        curso2.setCargaHoraria(36);

        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Ajudar com Java");
        mentoria.setData(LocalDate.now());

        bootcamp.setNome("Bootcamp Desenvolvimento Orientado a Objeto");
        bootcamp.setDecricao("Descrição Bootcamp Desenvolvimento Orientado a Objeto");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.increverBootcamp(bootcamp);
        devMarcelo.progredir();
        System.out.println("Conteudos Inscritos de Marcelo" + devMarcelo.getConteudosIncritos());
        System.out.println("-_-_-");
        System.out.println("Conteudos Concluidos de Marcelo" + devMarcelo.getConteudosConcluidos());

        System.out.println("-_-_-_-_-_-_-_-_-_-_-");
        Dev devBruna = new Dev();
        devBruna.setNome("Bruna");
        devBruna.increverBootcamp(bootcamp);
        devBruna.progredir();
        devBruna.progredir();
        System.out.println("Conteudos Inscritos de Bruna" + devBruna.getConteudosIncritos());
        System.out.println("-_-_-");
        System.out.println("Conteudos Concluidos de Bruna" + devBruna.getConteudosConcluidos());





    }
}