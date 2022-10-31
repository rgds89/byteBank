package br.com.alura.treinamento.bytebank;

import br.com.alura.treinamento.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Funcionario jose = new Funcionario(1, "José Pereira", LocalDate.of(1990, 1, 10));
        Funcionario maria = new Funcionario(2, "Maria Silva", LocalDate.of(1992, 8, 20));

        System.out.println(jose);
        System.out.println(maria);
    }
}