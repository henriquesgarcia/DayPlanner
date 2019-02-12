package com.henrique.dayplanner.model;


import java.util.Timer;

public class AppTeste {

    private static int opcao;
    private static String s;

    public static void main(String[] args) {

        Service service = new Service();

        do {

            opcao = Integer.valueOf(JOptionPane.showInputDialog(menuPrincipal()));

            switch (opcao){
                case 1:
                    JOptionPane.showInputDialog(menuCriarLembrete());
                    String tituloLembrete = JOptionPane.showInputDialog("Título");
                    service.criarLembrete(tituloLembrete,descricaoLembrete,dataLembrete,categoriaLembrete);
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null,service.listarLembretes());
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null,"Saindo do app...");
                    Timer.getLogTimers();

                default:
                    JOptionPane.showMessageDialog(null,"Insira um valor válido!");
            }

        } while (opcao != 0);
    }

    private static String menuPrincipal(){

        s = "----- Day Planner -----\n\n";
        s += "1 - Criar Lembrete\n";
        s += "2 - Listar Lembretes\n";
        s += "3 - Editar Lembrete\n\n";

        s += "-------------\n";
        s += "Lembretes:\n";


        return s;

    }

    private static String menuCriarLembrete(){

        s = "---------------- CRIAR LEMBRETE ----------------\n\n";
        s += "Titulo:";

        return s;
    }

    private static String menuListarQuadros(){
        s = "---------------- LISTA DE LEMBRETES ----------------\n\n";

        return s;
    }
}
