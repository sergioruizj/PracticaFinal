package com.example.EstructurasDeDatos;

public class ElementoArbol<TipoDato> {
    private TipoDato dato;
    private ElementoArbol<TipoDato> nodoIzq;
    private ElementoArbol<TipoDato> nodoDch;

    public ElementoArbol(TipoDato dato) {
        this.dato = dato;
    }

    public ElementoArbol<TipoDato> getNodoIzq() {
        return nodoIzq;
    }

    public void setNodoIzq(ElementoArbol<TipoDato> nodoIzq) {
        this.nodoIzq = nodoIzq;
    }

    public ElementoArbol<TipoDato> getNodoDch() {
        return nodoDch;
    }

    public void setNodoDch(ElementoArbol<TipoDato> nodoDch) {
        this.nodoDch = nodoDch;
    }
}
