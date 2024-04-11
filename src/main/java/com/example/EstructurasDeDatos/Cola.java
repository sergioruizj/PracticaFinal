package com.example.EstructurasDeDatos;

public class Cola<TipoDato> {
    ElementoCola<TipoDato> primero;
    ElementoCola<TipoDato> ultimo;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
    }

    private boolean isVacia() {
        return primero == null;
    }

    public void push(TipoDato dato) {
        ElementoCola<TipoDato> elemento = new ElementoCola<>(dato);
        if (!this.isVacia()) {
            primero = elemento;
        } else {
            ultimo.setSiguiente(elemento);
        }
        ultimo = elemento;
    }

    public TipoDato pop() {
        if (this.isVacia()) {
            return null;
        } else {
            TipoDato datoExpulsado = primero.getDato();
            primero = primero.getSiguiente();
            if (primero == null) {
                ultimo = null;
            }
            return datoExpulsado;
        }
    }

    public Integer getNumeroElementos() {
        Integer contador = 0;
        if (this.isVacia()) {
            return contador;
        } else {
            ElementoCola<TipoDato> actual = primero;
            contador++;
            while (actual.getSiguiente() != null) {
                contador++;
                actual = actual.getSiguiente();
            }
            return contador;
        }
    }
}
