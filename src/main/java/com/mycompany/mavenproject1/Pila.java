/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author alest
 */
public class Pila {
    
    class Nodo {
        int info;
        Nodo sig;
    }

    private Nodo raiz;  

    public Pila() {
        raiz = null;  
    }

    public void push(int x) {
        Nodo nuevo;
        nuevo = new Nodo();  
        nuevo.info = x;  
        if (raiz == null) {
            nuevo.sig = null;  
            raiz = nuevo;  
        } else {
            nuevo.sig = raiz;  
            raiz = nuevo;  
        }
    }

    public void imprimirPila() {
        Nodo aux = raiz;
        System.out.println("La pila tiene los siguientes valores: ");
        while (aux != null) {  
            System.out.println(aux.info + "-");  
            aux = aux.sig;  
        }
    }

    public int pop() {
        if (raiz != null) {
            int inf = raiz.info;  
            raiz = raiz.sig;  
            return inf;  
        } else {
            return Integer.MAX_VALUE;  
        }
    }

    public static void main(String[] args) {
        Pila pila1 = new Pila();  
        pila1.push(6);  
        pila1.push(7);
        pila1.push(155);

        pila1.imprimirPila();  
        pila1.pop();  
        pila1.imprimirPila();  
    }
}