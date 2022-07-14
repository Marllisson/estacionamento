package main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import desenv.Estacionamento;
import desenv.Pessoa;
import desenv.Tipo;
import desenv.Veiculo;

public class Tester {

    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento();
        Pessoa p1;

        Scanner scan = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("---------------------");
            System.out.println("Menu:");
            System.out.println("1-Entrada Veículo");
            System.out.println("2-Saída Veículo");
            System.out.println("3-Listar Veículos");
            System.out.println("4-Finalizar");
            System.out.println("Informe a opção: ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Entrada de Veículo: ");

                    p1 = new Pessoa("Fabio", "111.222.333-44", "(xx) 2222-3333");
                    String placa;
                    /*
                    System.out.println(estacionamento.entraVeiculo("QWE 2222", "Maverick", Tipo.CARRO, p1));

                    System.out.println(estacionamento.entraVeiculo("ASD 2222", "Maverick", Tipo.CARRO, p1));

                    System.out.println(estacionamento.entraVeiculo("ZXC 2222", "Maverick", Tipo.MOTO, p1));
                    System.out.println(estacionamento.entraVeiculo("RTY 2222", "Maverick", Tipo.MOTO, p1));


                     */
                    String placaEntrada, modelo, tipo;
                    scan.nextLine();
                    System.out.println("Informe a Placa do Veículo: ");
                    placaEntrada = scan.nextLine();

                    System.out.println("Informe Modelo: ");
                    modelo = scan.nextLine();

                    System.out.println("Informe o Tipo:");
                    tipo = scan.nextLine();

                    System.out.println(estacionamento.entraVeiculo(placaEntrada,modelo, Tipo.valueOf(tipo), p1));




                    break;

                case 2:
                    String placaSaida;

                    System.out.println("Saída de Veículo: ");
                    System.out.println("------");
                    scan.nextLine();
                    System.out.println("Informar placa");
                    placaSaida=scan.nextLine();

                    Calendar c = Calendar.getInstance();
                    System.out.println("Data/Hora atual: "+c.getTime());

                    System.out.print("Valor a pagar: R$");
                    System.out.println(estacionamento.saiVeiculo("QWE 2222"));
                    break;

                case 3:

                    System.out.println("Listar Veículos no Estacionamento");
                    ArrayList<Veiculo> lista = estacionamento.listaEstacionados();
                    for (int i = 0; i < lista.size(); i++)
                        System.out.println(lista.get(i).getPlaca());
                    break;
                case 4:
                    //Finaliza Sistema opção4
                    System.out.println("Finalizando programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção invalida! ");
            }


        } while (menu != 4);
    }
}