package com.example.EstructurasDeDatos;

public class ArbolBinario<TipoDato> {
    private ElementoArbol<TipoDato> raiz;

    public ElementoArbol<TipoDato> getRaiz() {
        return raiz;
    }

    public ArbolBinario(TipoDato raiz) {
        this.raiz = new ElementoArbol<>(raiz);
        this.raiz.setNodoIzq(null);
        this.raiz.setNodoDch(null);
    }

    public ArbolBinario(TipoDato datoRaiz, ElementoArbol<TipoDato> padre, ElementoArbol<TipoDato> madre){
        this.raiz=new ElementoArbol<>(datoRaiz);
        this.raiz.setNodoDch(padre);
        this.raiz.setNodoIzq(madre);
    }
}
