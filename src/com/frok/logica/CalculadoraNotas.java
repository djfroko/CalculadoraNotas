package com.frok.logica;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraNotas {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Integer> listaPrecios = new ArrayList();

    public void iniciarApp() {

        int opcion = 0;

        do {
            menu();
            opcion = sc.nextInt();
            comprobarOpcion(opcion);
        } while (opcion != 6);


    }

    private void menu() {
        System.out.println("============================");
        System.out.println("1. Nuevo precio ");
        System.out.println("2. Precio Medio");
        System.out.println("3. Precio Maximo");
        System.out.println("4. Precio Minimo");
        System.out.println("5. Mostrar todos los precios");
        System.out.println("6. Salir");
        System.out.println();
        System.out.print("Elige una opcion: ");


    }

    private void comprobarOpcion(int opcion) {

        switch (opcion) {
            case 1:
                nuevoPrecio();
                break;
            case 2:
                precioMedio();
                break;
            case 3:
                precioMaximo();
                break;
            case 4:
                precioMinimo();
                break;
            case 5:
                mostrarPrecios();
                break;
            case 6:
                salir();
                break;
            default:
                System.out.println("La opcion elegida no es valida");

        }


    }

    private void nuevoPrecio() {
        System.out.print("Dime el precio: ");
        int nuevoPrecio = sc.nextInt();
        listaPrecios.add(nuevoPrecio);
        System.out.println(" TEST " + listaPrecios);

    }

    private void precioMedio() {
        int aux = 0;
        for (int precio : listaPrecios) {
            aux += precio;
        }
        System.out.println("=============================");

        System.out.println("El precio medio es " + aux / listaPrecios.size());


    }

    private void precioMaximo() {
        int aux = 0;
        for (int precio : listaPrecios) {
            if (precio > aux) {
                aux = precio;
            }

        }
        System.out.println("precio maximo es " + aux);

    }

    private void precioMinimo() {
        int aux = listaPrecios.get(0);
        for (int i = 1; i < listaPrecios.size(); i++) {
            if (listaPrecios.get(i) < aux) {
                aux = listaPrecios.get(i);
            }
        }


        System.out.println("precio minimo es " + aux);
    }


        private void mostrarPrecios() {
            System.out.println("==================");
            System.out.print("la lista de precios es: ");
            System.out.println(listaPrecios);
            System.out.println("==================");

        }

        private void salir() {
            System.out.println("Hasta luego lucas!!!!");

        }


    }

