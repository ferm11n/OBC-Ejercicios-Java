import java.util.Scanner;

class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int num1,num2, num3, resultado;
        
        
        System.out.println("Por favor digite el primer valor de tipo entero");
        num1 = input.nextInt();
           System.out.println("el valor almacenado es:"+ num1);
           
            System.out.println("Por favor digite el segundo valor de tipo entero");
        num2 = input.nextInt();
           System.out.println("el valor almacenado es:"+ num2);
        
            System.out.println("Por favor digite el tercer valor de tipo entero");
        num3 = input.nextInt();
            System.out.println("el valor almacenado es:"+ num3);

           
           resultado= num1 + num2 + num3;
           
           System.out.println("este es el resultado final de la suma es: "+resultado);
    
    }
}