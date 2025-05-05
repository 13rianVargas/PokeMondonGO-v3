package co.edu.konradlorenz.model.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import co.edu.konradlorenz.view.Vista;

public class ArchivosConexion {

    private static final String ruta = "src/co/edu/konradlorenz/data/";

    public static void guardar(Object objeto, String nombreArchivo) {

        File file = new File(ruta + nombreArchivo);

        try (FileOutputStream fileOut = new FileOutputStream(file);
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(objeto);
            Vista.mostrarMensaje("El objeto ha sido guardado en: " + ruta + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        } // try-catch

    }// guardar

    public static Object leer(String nombreArchivo) {

        Object objeto = null;

        File file = new File(ruta + nombreArchivo);

        if (file.exists()) {
            
            try (FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn)) {
                objeto = in.readObject();
                Vista.mostrarMensaje("Objeto leído: " + objeto);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } // try-catch
            
        } else {
            Vista.mostrarMensaje("El archivo " + nombreArchivo + " no existe.");
        } // if-else

        return objeto;

    }// leer

    public static void borrar(String archivo) {

        File file = new File(ruta + archivo);

        if (file.exists()) {
            if (file.delete()) {
                Vista.mostrarMensaje("El archivo " + archivo + " ha sido eliminado.");
            } else {
                Vista.mostrarMensaje("No se pudo eliminar el archivo " + archivo);
            } // if-else
        } else {
            Vista.mostrarMensaje("El archivo " + archivo + " no existe.");
        } // if-else
        
    }// borrar

}// class