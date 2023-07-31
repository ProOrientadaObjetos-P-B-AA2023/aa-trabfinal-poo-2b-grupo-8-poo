package MODEL;

import java.util.Scanner;
public class Planes {
    public static PlanPostPagoMegas plan1(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres del propietario: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese los apellidos del propietario: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese el Pasaporte: ");
        String pasaporte = entrada.nextLine();
        System.out.println("Ingrese la ciudad: ");
        String ciu = entrada.nextLine();
        System.out.println("Ingrese el barrio: ");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese la marca del celular: ");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular: ");
        String modelo = entrada.nextLine();
        System.out.println("Ingrese el número de celular: ");
        int num = entrada.nextInt();
        
        System.out.println("Ingrese los megas del plan: ");
        double megas = entrada.nextDouble();
        System.out.println("Ingrese el costo por Mega: ");
        double costoMeg = entrada.nextDouble();
        System.out.println("Ingrese la tarifa base: ");
        double tafB = entrada.nextDouble();
        
        PlanPostPagoMegas p1 = new PlanPostPagoMegas
        (nombre, apellido, pasaporte, ciu, barrio, marca, modelo, num, 
                megas, costoMeg, tafB);
        
        p1.calcularPagoMensual();
        
        return p1;
    }
    
    public static PlanPostPagoMinutos plan2(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres del propietario: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese los apellidos del propietario: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese el Pasaporte: ");
        String pasaporte = entrada.nextLine();
        System.out.println("Ingrese la ciudad: ");
        String ciu = entrada.nextLine();
        System.out.println("Ingrese el barrio: ");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese la marca del celular: ");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular: ");
        String modelo = entrada.nextLine();
        System.out.println("Ingrese el número de celular: ");
        int num = entrada.nextInt();
        
        System.out.println("Ingresar los minutos Nacionales: ");
        double minN = entrada.nextDouble();
        System.out.println("Ingresar el costo por minutos Nacionales: ");
        double costoN = entrada.nextDouble();
        System.out.println("Ingrese los minutos Internacionales: ");
        double minI = entrada.nextDouble();
        System.out.println("Ingrese el costo por minutos Internacionales: ");
        double costoI = entrada.nextDouble();
        
        PlanPostPagoMinutos p2 = new PlanPostPagoMinutos(nombre, apellido, 
                pasaporte, ciu, barrio, marca, modelo, num, minN, costoN, 
                minI, costoI);
        
        p2.calcularPagoMensual();
        
        return p2;
    }
    
    
    public static PlanPostPagoMinutosMegas plan3(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres del propietario: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese los apellidos del propietario: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese el Pasaporte: ");
        String pasaporte = entrada.nextLine();
        System.out.println("Ingrese la ciudad: ");
        String ciu = entrada.nextLine();
        System.out.println("Ingrese el barrio: ");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese la marca del celular: ");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular: ");
        String modelo = entrada.nextLine();
        System.out.println("Ingrese el número de celular: ");
        int num = entrada.nextInt();
        
        System.out.println("Ingresar los minutos: ");
        double min = entrada.nextDouble();
        System.out.println("Ingresar el costo minutos: ");
        double costomin = entrada.nextDouble();
        System.out.println("Ingrese los megas: ");
        double megas = entrada.nextDouble();
        System.out.println("Ingrese el costo de los megas: ");
        double costomeg = entrada.nextDouble();
        
        PlanPostPagoMinutosMegas p3 =  new PlanPostPagoMinutosMegas(nombre, 
                apellido, pasaporte, ciu, barrio, marca, modelo, num, min, 
                costomin, megas, costomeg);
        
        p3.calcularPagoMensual();
        
        return p3;
    }
    
    public static PlanPostPagoMinutosMegasEconomico plan4(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres del propietario: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese los apellidos del propietario: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese el Pasaporte: ");
        String pasaporte = entrada.nextLine();
        System.out.println("Ingrese la ciudad: ");
        String ciu = entrada.nextLine();
        System.out.println("Ingrese el barrio: ");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese la marca del celular: ");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular: ");
        String modelo = entrada.nextLine();
        System.out.println("Ingrese el número de celular: ");
        int num = entrada.nextInt();
        
         System.out.println("Ingresar los minutos: ");
        double min = entrada.nextDouble();
        System.out.println("Ingresar el costo minutos: ");
        double costomin = entrada.nextDouble();
        System.out.println("Ingrese los megas: ");
        double megas = entrada.nextDouble();
        System.out.println("Ingrese el costo de los megas: ");
        double costomeg = entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento del plan: ");
        int des = entrada.nextInt();
        
        PlanPostPagoMinutosMegasEconomico p4 = new 
        PlanPostPagoMinutosMegasEconomico(nombre, apellido, pasaporte, ciu, 
                barrio, marca, modelo, num, min, costomin, megas, costomeg, des);
        
        p4.calcularPagoMensual();
        
        return p4;
    }
}

