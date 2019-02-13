/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import swing.User;
/**
 *
 * @author dam
 */
public class test {
    private static User user;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filePath = "/Users/dam/NetBeansProjects/Swing/src/swing/partituras.txt";
    HashMap<String, String> map = new HashMap<String, String>();

    String line;
    //BufferedReader reader = new BufferedReader(new FileReader(filePath));
    String str = "Hello";
    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
    writer.write(str);
     
    writer.close();
    //reader.close();
    }
    // Método para imprimir el array de Personas
    /*static void imprimeArrayPersonas(Coche[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i].getModelo() + " - Altura: " + array[i].getAño() + " - Edad: " + array[i].getKm() + " - Edad: " + array[i].getPrecio());
        }
    }*/
    static void mostrarPrecio(ArrayList<String> arrayPalabras){
        int max = 0;
        String z = "";
        int x = 0;
        for (int i = 3; i < arrayPalabras.size(); i = i + 4) {
            if (Integer.parseInt(arrayPalabras.get(i)) > max) {
                max = Integer.parseInt(arrayPalabras.get(i));
                z = arrayPalabras.get(x);
                x = x + 4;
            }
        }
        System.out.println("El coche más caro es: " + z + " con el precio " + max);
        /*
        int i = 3;
        while(i < arrayPalabras.size()){
                
            System.out.println("Precio: " + arrayPalabras.get(i));
                i = i + 4;
            }*/
    }
    static void mostrarModelo(ArrayList<String> arrayPalabras){
        int i = 0;
        while(i < arrayPalabras.size()){
                
            System.out.println("Modelo: " + arrayPalabras.get(i));
                i = i + 4;
            }
    }
    /*
    static void mostrarTodo(ArrayList<String> arrayPalabras, String linea, BufferedReader br, String[] car, Coche[] arrayPersonas, int x) throws IOException{
         while ((linea = br.readLine()) != null) {
                arrayPalabras.add(linea);
                car = linea.split(",");
                //System.out.println(car[x]);
                user = new Coche(car[0], Integer.parseInt(car[1]), Integer.parseInt(car[2]), Double.parseDouble(car[3]));
                System.out.println(user);
                arrayPersonas[x] = new Coche(car[0], Integer.parseInt(car[1]), Integer.parseInt(car[2]), Double.parseDouble(car[3]));
                x++;
            }
    }*/
}
