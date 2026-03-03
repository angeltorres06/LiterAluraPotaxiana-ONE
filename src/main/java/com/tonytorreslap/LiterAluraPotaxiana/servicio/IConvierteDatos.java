package com.tonytorreslap.LiterAluraPotaxiana.servicio;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class <T> clase);
}
