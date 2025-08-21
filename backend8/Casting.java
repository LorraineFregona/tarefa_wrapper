import java.util.Scanner;

public class Casting {
    
    public static void executarCasting() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int primitivo = scanner.nextInt();
        
        Integer wrapper = primitivo;
        
        System.out.println("Valor digitado: " + wrapper);
    }
    
    public static void main(String[] args) {
        executarCasting();
    }
}