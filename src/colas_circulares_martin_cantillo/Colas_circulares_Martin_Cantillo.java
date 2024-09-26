


package colas_circulares_martin_cantillo;

import java.util.Scanner;

/**
 *
 * 
 */
public class Colas_circulares_Martin_Cantillo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamaño, opc, dato, cola[], fi=-1, fr=-1;
        System.out.println("----------------------------------------------------------------------------------------------------------");
         System.out.println("---------------------------------------");
          System.out.println("---------------------------------------");
        System.out.println("------------------COLAS CIRCULARES --------------");
        System.out.println(" **");
        System.out.println("POR FAVOR INGRESE EL TAMAÑO DE LA COLA ");
        tamaño= entrada.nextInt();
        cola=new int [tamaño];
        
        do{
            System.out.println("1.--INGRESAR UN ELEMENTO--");
            System.out.println("2.--ELIMINAR UN ELEMENTO --");
            System.out.println("3.-MOSTRAR LA COLA");
            System.out.println("4.--SALIR--");
            opc=entrada.nextInt();
            switch (opc){
                case 1 :
                    System.out.println("INGRESE UN DATO ");
                    dato=entrada.nextInt();
                    System.out.println("DATO INSERTADO");
                    if((fi==tamaño-1 && fr==0) || fr==fi+1){
                        System.out.println("LA COLA ESTA LLENA ");
                    }
                    else {
                        if(fr==-1&&fi==-1){
                             fr=0;
                             fi=0;
                        }
                        else{ 
                        if (fi<tamaño-1){
                            fi++;
                        }
                        else {
                            fi=0;
                        }
                    }
                        cola[fi]=dato;  
                    }
                    
                    break ;
                case 2: 
                    System.out.println("---ELIMINAR ELEMENTO ---");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println("***********************************************************");
                    System.out.println("****************************");
                    System.out.println("ELIMINANDO ELEMENTO......");
                    System.out.println(".......................");
                    System.out.println("..............");
                    System.out.println("........");
                    System.out.println("---------------------------------------ESPERE UN MOMENTO---------------");
                    System.out.println("");
                    System.out.println("UN MOMENTO......");
                    System.out.println("...........");
                    System.out.println("[SE HA ELIMINADO EL ELEMENTO ]");
                    System.out.println("");
                    System.out.println("[[[GRACIAS POR SU ESPERA]]]");
                    System.out.println("");
                    if(fr==-1&&fi==-1){
                        System.out.println("COLA VACIA");
                    }
                    else{
                       cola[fr]=0;
                       fr++;
                       if(fr==tamaño-1&&fi!=-1){
                           fr=0;
                           fi++;
                       }
                    }
                        
                    break;
                case 3: 
                    System.out.println("*************************************************************");
                    System.out.println("******************************");
                    System.out.println("************");
                    System.out.println("*****");
                    System.out.println("COLA CIRCULAR ");
                    for (int i = 0; i < cola.length; i++) {
                        System.out.print(cola[i] + "--");
                    }
                    System.out.println("");
                    break;
            }
        }while(opc!=4);
        
    }
    

}