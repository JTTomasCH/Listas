package listas;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DIEGO
 */
public class ListaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Lista<String> miLista = new Lista<String>();
        
        
        System.out.println("Agregar al final: ");
        miLista.addLast("Tomas");
        miLista.addLast("Juan");
        miLista.addLast("Andres"); 
        for (String elem : miLista) {
            System.out.println(elem);
        }
        System.out.println("");
        
        System.out.println("Agregar al principio: ");
        miLista.addFirst("Alba");
        for (String elem : miLista) {
            System.out.println(elem);
        }
        System.out.println("");
        
        System.out.println("Ingresar en la mitad:  ");
        miLista.addMiddle("Zuleyma", 1);
        for (String elem : miLista) {
            System.out.println(elem);
        }
        System.out.println("");
        
        System.out.println("igual? "+miLista.search("Zuleyma"));
        System.out.println("tamanio "+miLista.size()+"\n");
        
        Lista<Persona> personas = new Lista<Persona>();
        Persona per1 = new Persona("Carlos",15);
        Persona per2 = new Persona("Luisa",32);
        personas.addLast(per1);
        personas.addLast(per2);
        System.out.println("Agregar al final: ");
        for (Persona elem : personas) {
            System.out.println(elem);
        }
        System.out.println("");
        
        System.out.println("Agregar al principio: ");
        Persona per3 = new Persona("Camila",20);
        personas.addFirst(per3);
        
        for (Persona elem : personas) {
            System.out.println(elem);
        }
        System.out.println("");
        
        System.out.println("Agregar a la mitad: ");
        Persona per4 = new Persona("Paula",10);
        personas.addMiddle(per4, 1);
        
        for (Persona elem : personas) {
            System.out.println(elem);
        }
        System.out.println("");
        
        System.out.println("el maximo es "+personas.maxItem());
        System.out.println("tamanio "+personas.size());
        
//        Lista<Persona> personas = new Lista<Persona>();
//        Persona per1 = new Persona("Carlos",15);
//        Persona per2 = new Persona("Luisa",32);
//        personas.addLast(per1);
//        personas.addLast(per2);
//        System.out.println("el maximo es "+personas.maxItem());
//        System.out.println("igual? "+personas.search(per1));
//        System.out.println("tamano "+personas.size());
//        for (Persona elem : personas) {
//            System.out.println(elem);
//        }
//        
//        
//        
//        
//        String persona1;
//        System.out.println("Ingrese una persona: ");
//        persona1 = sc.nextLine();
//        miLista.addFirst(persona1);
//        
//        miLista.addLast("Maria");
//        miLista.addLast("Juan");
//        miLista.addLast("Pedro");
//        
//        
//        miLista.addFirst("Tomas");
//        miLista.addFirst("Aleja");
//        
//        
//        miLista.addMiddle("Jorge", 0);
//        
//        for (String elem : miLista) {
//            System.out.println(elem);
//        }
//        
//        System.out.println("el maximo valor es "+miLista.maxItem());
//        for (String elem : miLista) {
//            System.out.println(elem);
//        }
//        
//        String busqueda=new String("Juan");
//        System.out.println("Buscar "+"Juan "+miLista.search(busqueda));
//        
//        
//        //miPila.showStack();
//        System.out.println("retiro " + miLista.removeLast());
//        for (String elem : miLista) {
//            System.out.println(elem);
//        }
//        System.out.println("retiro " + miLista.removeLast());
//        for (String elem : miLista) {
//            System.out.println(elem);
//        }
//        
//
    }

}
