package com.pruebasCSV;
/*
  Ejemplo sencillo de acceso a un archivo .csv desde java
  NO UTILILZA NINGÚN GESTOR DE DEPENDENCIAS
   */

import com.opencsv.CSVReader;
import com.pruebasCSV.com.pruebasCSV.LectorCSV;

import java.io.FileReader;

public class PruebasCSV {
    /**
     * @author  Alejandro González Gancedo
     */

    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();
        miLector.leeCSV("./datos/pokemon.csv");
    }


}
