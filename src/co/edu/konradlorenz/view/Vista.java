package co.edu.konradlorenz.view;

import java.util.Scanner;

import co.edu.konradlorenz.controller.Controller;

public class Vista {
    private Scanner sc = new Scanner(System.in);
    
    public static void mostrarLinea(String mensaje){
        System.out.println(mensaje);
    }//mostrarLinea
    
    public static void mostrarMensaje(String mensaje){
        espacioVisual();
        mostrarLinea(mensaje);
        espacioVisual();
        Controller.delay();
    }//mostrarMensaje

    public static String pedirDato(String mensaje){
        Vista v = new Vista();
        mostrarLinea(" >> " + mensaje + ": ");
        return v.sc.nextLine();
    }//pedirDato

    public static void espacioVisual(){
        mostrarLinea("\n\n\n\n\n\n\n");
    }//espacioVisual

    public static void pikaPika(){
        espacioVisual();
        mostrarLinea(
                        "🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨\n" + //
                        "🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨\n" + //
                        "🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨\n" + //
                        "🟨⬛⬜🟨🟨🟨🟨🟨⬛⬜🟨  ██████  ██ ██   ██  █████      ██████  ██ ██   ██  █████  \n" + //
                        "🟨⬛⬛🟨🟨🟨🟨🟨⬛⬛🟨  ██   ██ ██ ██  ██  ██   ██     ██   ██ ██ ██  ██  ██   ██ \n" + //
                        "🟨⬛⬛🟨🟨⬛🟨🟨⬛⬛🟨  ██████  ██ █████   ███████     ██████  ██ █████   ███████\n" + //
                        "🟥🟨🟨🟨🟨🟨🟨🟨🟨🟨🟥  ██      ██ ██  ██  ██   ██     ██      ██ ██  ██  ██   ██ \n" + //
                        "🟥🟥🟨🟨🟨⬛🟨🟨🟨🟥🟥  ██      ██ ██   ██ ██   ██     ██      ██ ██   ██ ██   ██ \n" + //
                        "🟥🟥🟨🟨⬛🟨⬛🟨🟨🟥🟥\n" + //
                        "🟥🟨🟨🟨🟨🟨🟨🟨🟨🟨🟥\n" + //
                        "🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨🟨\n" + //
                        " \n \n \n");
    }//pikaPika
    
}//class