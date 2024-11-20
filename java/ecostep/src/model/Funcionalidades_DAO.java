package model;

import java.util.Random;

public class Funcionalidades_DAO {
    
    public static String estacaoText;
    public static int horaAtual;
    public static String horario;
    
    public static int passageiros = 0;
    public static int passos = 0;
    public static int energia = 0;
    public static double preco = 0.0;
    
    public static void definirEstacao(String estacao) {
        estacaoText = estacao;
        Random random = new Random();

        // Gera passageiros entre 300.000 e 500.000, com modificadores para cada estação
        int passageirosBase;
        switch (estacao) {
            case "Luz":
                passageirosBase = 300000 + random.nextInt(200000);
                break;
            case "Sé":
                passageirosBase = (int)(300000 + random.nextInt(200000) * 1.2); // 20% a mais de passageiros
                break;
            case "Trianon | MASP":
                passageirosBase = (int)(300000 + random.nextInt(200000) * 0.8); // 20% a menos de passageiros
                break;
            case "Belém":
                passageirosBase = (int)(300000 + random.nextInt(200000) * 1.1); // 10% a mais de passageiros
                break;
            case "Tucuruvi":
                passageirosBase = (int)(300000 + random.nextInt(200000) * 0.9); // 10% a menos de passageiros
                break;
            default:
                passageirosBase = 300000 + random.nextInt(200000);
                break;
        }

        // Aplica o modificador de horário de pico
        passageiros = definirPassageirosHorarioPico(passageirosBase);
        
        passos = calcularPassos(passageiros);
        energia = calcularEnergia(passos);
        preco = calcularPreco(energia);
    }

    public static void definirHora(String hora){
        switch(hora){
            case "06:00":
                horaAtual = 6;
                horario = "Horário de Pico";
                break;
            case "12:00":
                horaAtual = 12;
                horario = "Horário Normal";
                break; 
            case "17:00":
                horaAtual = 17;
                horario = "Horário de Pico";
                break;
            case "22:00":
                horaAtual = 22;
                horario = "Horário Reduzido";
                break;                
        }
    }

    
    public static int definirPassageirosHorarioPico(int passageirosBase) {
        double modificador;
        
        if ((horaAtual >= 6 && horaAtual <= 9) || (horaAtual >= 17 && horaAtual <= 20)) {
            modificador = 1.5; // 50% a mais de passageiros nos horários de pico
        } else if (horaAtual >= 12 && horaAtual <= 14) {
            modificador = 1.2; // 20% a mais ao meio-dia
        } else {
            modificador = 0.8; // 20% a menos fora dos horários de pico
        }

        return (int)(passageirosBase * modificador);
    }

    public static int calcularPassos(int passageiros) {
        // Calcula passos como uma média de 3 a 4 passos por passageiro
        return (int) (passageiros * 3.5); // Média entre 3 e 4
    }

    public static int calcularEnergia(int passos) {
        // Calcula a energia gerada, assumindo que cada passo gera 0.0006 kWh
        double energiaPorPasso = 0.0006;
        return (int) (passos * energiaPorPasso);
    }

    public static int calcularPreco(double energia) {
        // Calcula o valor da energia gerada, com o kWh valendo R$0,60
        double precoPorKwh = 0.60;
        return (int) (energia * precoPorKwh);
    }

}
