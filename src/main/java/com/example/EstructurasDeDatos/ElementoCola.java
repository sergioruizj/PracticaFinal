package com.example.EstructurasDeDatos;

public class ElementoCola<TipoDato>{
    private TipoDato dato;
    private ElementoCola<TipoDato> siguiente;

    public ElementoCola(TipoDato dato) {
        this.dato = dato;
        this.siguiente=null;
    }

    public TipoDato getDato() {
        return dato;
    }

    public void setDato(TipoDato dato) {
        this.dato = dato;
    }

    public ElementoCola<TipoDato> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ElementoCola<TipoDato> siguiente) {
        this.siguiente = siguiente;
    }
}
