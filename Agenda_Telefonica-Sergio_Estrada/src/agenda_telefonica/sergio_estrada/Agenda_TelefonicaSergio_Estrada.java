package agenda_telefonica.sergio_estrada;

import java.util.Scanner;

public class Agenda_TelefonicaSergio_Estrada {

    static contacto miscontactos[] = new contacto[15];

    static int contador = 0;

    public static void main(String[] args) {

        int opc = 0;

        Scanner teclado = new Scanner(System.in);

        while (opc != 4) {

            System.out.println("---------------------Menu principal---------------------");

            System.out.println("1. Crear contacto");

            System.out.println("2. Ver contacto");

            System.out.println("3. Buscar contacto");

            System.out.println("4. Salir");

            System.out.println("Ingrese el numero de opcion");

            opc = teclado.nextInt();

            if (opc == 1) {

                crearcontacto();

            } else if (opc == 2) {

                System.out.println("--Los datos del contacto son--");

                verTodos();

            } 
            

                
        }

    }

    static public void verTodos() {

        for (int i = 0; i < contador; i++) {

            System.out.println("nombre: " + miscontactos[i].vercontacto());

            System.out.println("numero de telefono: " + miscontactos[i].vernum_tel());

            System.out.println("adomicilio: " + miscontactos[i].veradomicilio());

            System.out.println("#####################################################");

        }

    }

    static public void crearcontacto() {

        if (contador >= 15) {

            System.out.println("--Memoria llena--");

        } else {

            Scanner entrada = new Scanner(System.in);

            System.out.println("-------Contacto Nuevo-------");

            System.out.println("-Ingrese el nombre del contacto");

            String nombre1 = entrada.nextLine();

            System.out.println("-Ingrese su numero de telefono");

            String num_tel = entrada.nextLine();

            System.out.println("-ingrese su adomicilio-");

            String adomicilio1 = entrada.nextLine();

            miscontactos[contador] = new contacto(num_tel, nombre1, adomicilio1);

            contador++;

        }

    }

    

    }


