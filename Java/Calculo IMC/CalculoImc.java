package calculoimc;

import java.util.Scanner;

public class CalculoImc {
    
    public static double IMC(double peso, double altura){
        return peso / (altura * altura);
    }

    public static void main(String[] args) {
        Scanner novoPeso = new Scanner(System.in);
        Scanner novaAltura = new Scanner(System.in);
        
        System.out.println("----------- Calculadora de IMC -----------");
        System.out.print("Digite seu peso (em kg): ");
        double peso = novoPeso.nextDouble();
        System.out.print("Digite sua altura (em m)): ");
        double altura = novaAltura.nextDouble();
        
        double totalImc = CalculoImc.IMC(peso, altura);
        
        System.out.printf("IMC = %.1f. \nCategoria: ", totalImc);
        
        if(totalImc < 18.5) System.out.println("abaixo do peso ideal.");
        else if(totalImc < 24.9) System.out.println("peso ideal.");
        else if(totalImc < 29.9) System.out.println("sobrepeso.");
        else System.out.println("obesidade.");
        
    }
    
}
