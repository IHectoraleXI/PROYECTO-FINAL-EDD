package cashdown;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class CashDown {

    public static void main(String[] args) {
        double saldo = 10000;

        LinkedList<Integer> apuestas = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            apuestas.add((int) (Math.random() * 10000) * 10);
        }
        apuestas.sort(null);

        ArrayList<String> afc = new ArrayList<>();
        afc.add("01 Pittsburgh Steelers");
        afc.add("02 Baltimore Ravens");
        afc.add("03 Cincinnati Bengals");
        afc.add("04 Cleveland Browns");
        afc.add("05 Buffalo Bills");
        afc.add("06 Miami Dolphins");
        afc.add("07 New England Patriots");
        afc.add("08 New York Jets");
        afc.add("09 Houston Texans");
        afc.add("10 Indianapolis Colts");
        afc.add("11 Jacksonville Jaguars");
        afc.add("12 Tennessee Titans");
        afc.add("13 Denver Broncos");
        afc.add("14 Kansas City Chiefs");
        afc.add("15 Las Vegas Raiders");
        afc.add("16 Los Angeles Chargers");

        Scanner entrada = new Scanner(System.in);
        System.out.println("----------CASHDOWN---------- \n"
                + "Su saldo actual es de: $" + saldo + "\n");
        System.out.println("----------- MENÚ -----------\n"
                + "Presione una tecla.\n"
                + "1. Equipos AFC\n"
                + "2. Ingresar saldo.\n"
                + "3. Salir");
        System.out.print(">");
        int opcMenu = entrada.nextInt();
        if (opcMenu != 3) {
            switch (opcMenu) {
                case 1:
                    System.out.println(afc);
                    System.out.println("Teclee el número del equipo para ver más información. Teclee 0 para volver al menú principal.");
                    System.out.print(">");
                    int opc1 = entrada.nextInt();
                    if (opc1 != 0) {
                        switch (opc1) {
                            case 1:
                                System.out.println(afc.get(0));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                int opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println(afc.get(1));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println(afc.get(2));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 4:
                                System.out.println(afc.get(3));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 5:
                                System.out.println(afc.get(4));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 6:
                                System.out.println(afc.get(5));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 7:
                                System.out.println(afc.get(6));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 8:
                                System.out.println(afc.get(7));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 9:
                                System.out.println(afc.get(8));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 10:
                                System.out.println(afc.get(9));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 11:
                                System.out.println(afc.get(10));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 12:
                                System.out.println(afc.get(11));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 13:
                                System.out.println(afc.get(12));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 14:
                                System.out.println(afc.get(13));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 15:
                                System.out.println(afc.get(14));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 16:
                                System.out.println(afc.get(15));
                                System.out.println("1. Apostar\n2. Ver todas las apuestas"
                                        + "\n3.Salir");
                                opc1x = entrada.nextInt();
                                switch (opc1x) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad a apostar.");
                                        int apuesta = entrada.nextInt();
                                        apuestas.add(apuesta);
                                        saldo = saldo - apuesta;
                                        break;
                                    case 2:
                                        System.out.println(apuestas);
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                        }
                    } else {
                        break;
                    }
                case 2:
                    System.out.println("Su saldo actual es de: $" + saldo
                            + "\n¿Desea depositar dinero en su cuenta?"
                            + "\n1. Si\n2. No\n");
                    System.out.print(">");
                    int opc3 = entrada.nextInt();
                    if (opc3 != 2) {
                        switch (opc3) {
                            case 1:
                                System.out.println("Ingrese la cantidad a depositar.");
                                System.out.print(">$");
                                double deposito = entrada.nextInt();
                                saldo = saldo + deposito;
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                        break;
                    } else {
                        break;
                    }
                case 3:
                    System.out.println("Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}
