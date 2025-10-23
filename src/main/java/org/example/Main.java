package org.example;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");


        System.out.println("digite o horario de entrada (HH:mm)");
        LocalTime entrada = LocalTime.parse(scanner.next(),formatter);

        System.out.println("digite a carga horaria diaria (em horas)");
        int cargaHorario = scanner.nextInt();


        System.out.println("horario real de saida");
        LocalTime saidaReal = LocalTime.parse(scanner.next(),formatter);

        scanner.close();


        LocalTime saidaPrevista = entrada.plusHours(cargaHorario);


        Duration diferenca = Duration.between(saidaPrevista,saidaReal);
        Long horasExtras = diferenca.toHours();
        Long minutosExtras = diferenca.toMinutes();


        System.out.println("\nHorário de entrada: " + entrada.format(formatter));
        System.out.println("Horário de saída previsto: " + saidaPrevista.format(formatter));
        System.out.println("Horário real de saída: " + saidaReal.format(formatter));


        if (horasExtras == 0 && minutosExtras == 0 ){
            System.out.println("saldo de horas extras : 0h : 0min");
        }else {
            String sinal;

            if (horasExtras > 0 || minutosExtras > 0 ){
                sinal = "+";
            }else {
                sinal = "-";
            }
            System.out.println("saldo de horas : " + sinal + Math.abs(horasExtras) + " h " + Math.abs(minutosExtras) + " min ");
        }
    }
}



