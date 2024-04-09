import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean logico = true;
        DecimalFormat formato = new DecimalFormat("#.##");
        String mostrarTexto = "";
        double saldo = 754.54;
        Scanner sc = new Scanner(System.in);
        System.out.printf("""
                ************************************************************
                Nombre del cliente: Clark Ashton Smith
                Tipo de cuenta: Corriente
                Saldo disponible: %.2f$
                ************************************************************
                """, saldo);
        while (logico) {
            System.out.println(mostrarTexto);
            System.out.println("""
                    ** * ** Eliga una opcion ** * **
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """);
            int teclado = sc.nextInt();
            switch (teclado){
                case 1:
                    mostrarTexto = "Su saldo es: "+ formato.format(saldo)+" $";
                    break;
                case 2:
                    System.out.println("Digite el monto a retirar");
                    double retirar = sc.nextDouble();
                    if(retirar>saldo){
                        mostrarTexto = "Saldo invalido, um... Nos quieres robar?";
                        break;
                    }
                    saldo -= retirar;
                    mostrarTexto = "Saldo restante: "+formato.format(saldo)+" $";
                    break;
                case 3:
                    System.out.println("Cuanto vas a depositar");
                    double depositar = sc.nextDouble();
                    saldo += depositar;
                    mostrarTexto = "Su saldo actualizado es: "+formato.format(saldo)+" $";
                    break;
                case 9:
                    System.out.println("Finalizando el programa, gracias por utilizar nuestros servicios");
                    logico = false;
                    break;
            }
        }
    }
}