/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import MODEL.PlanPostPagoMinutosMegas;
import MODEL.PlanPostPagoMinutosMegasEconomico;
import MODEL.PlanPostPagoMegas;
import MODEL.PlanPostPagoMinutos;
import java.util.Scanner;
import static MODEL.Planes.*;
public class ejecutor1 {
   public void Menu(){
               Scanner entrada = new Scanner(System.in);
        
        Enlace c = new Enlace();
        boolean bandera = true;
        while (bandera) {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n",
                    "              >>Planes de Celular<<              ",
                    "1) Ingresar un Plan PostPago Megas",
                    "2) Ingresar un Plan PostPago Minutos",
                    "3) Ingresar un Plan PostPago Minutos-Megas",
                    "4) Ingresar un Plan PostPago Minutos-Megas ¡Economico!");                    
            int opcion = entrada.nextInt();
            
            switch (opcion) {
                
                case 1 -> {
                    PlanPostPagoMegas plan = plan1();
                    c.insertarPlanPostPagoMegas(plan);
                }
                case 2 -> {
                    PlanPostPagoMinutos plan = plan2();
                    c.insertarPlanPostPagoMinutos(plan);
                }
                
                case 3 -> {
                    PlanPostPagoMinutosMegas plan = plan3();
                    c.insertarPlanPostPagoMinutosMegas(plan);
                }
                
                case 4 -> {
                    PlanPostPagoMinutosMegasEconomico plan = plan4();
                    c.insertarPlanPostPagoMinutosMegasEconomico(plan);
                }
                default -> {}
            }                                       
            entrada.nextLine();
            System.out.println("Desea salir del proceso? Ingrese:  si");
            String salida = entrada.nextLine();
            if (salida.equals("si")) {
                bandera = false;
            }
        } 
        
        c.obtenerDataPlanPostPagoMegas();
        c.obtenerDataPlanPostPagoMinutos();
        c.obtenerDataPlanPostPagoMinutosMegas();
        c.obtenerDataPlanPostPagoMinutosMegasEconomico();
        
        if (c.obtenerArrayList().size()==0) {
            System.out.println("No hay nada que mostrar");
        } else {
            for (int i = 0; i < c.obtenerArrayList().size(); i++) {
                System.out.printf("%s\n", c.obtenerArrayList().get(i));
            } 
        }
}
}
