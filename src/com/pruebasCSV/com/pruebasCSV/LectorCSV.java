package com.pruebasCSV.com.pruebasCSV;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
Esta clase se encarga de leer el archivo
 */
public class LectorCSV {
    /**
     * @author Alejandro González
     */
    public void leeCSV(String nombreArchivo){
        try {
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String[] fila;
            while((fila = csvReader.readNext()) != null){
                System.out.println(fila[0] + " | " + fila[1] + " | " + fila[2] + " | ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
