import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Ingresa 2 numeros enteros");
        int num = input.nextInt();
        int num2= input.nextInt();
        int ulcifnum=num%10;
        int ulcifnum2=num2%10;

        if(ulcifnum==ulcifnum2){
            System.out.println("la ultima cifra de los numeros "+num+" y "+num2+" son iguales");
        }else{
            System.out.println("la ultima cifra de los numeros "+num+" y "+num2+" no son iguales");
        }

        System.out.println("Ingresar un numero de 3 cifras para ver si es capicua");
        int num3=input.nextInt();
        int aux= num3;
        int aux_=0;
        int capnum3=0;
        while (aux>0){
            aux_=aux%10;
            aux=aux/10;
            capnum3=(capnum3*10)+(aux_);
        }
        if(num3==capnum3){
            System.out.println("El numero "+num3+" es capicua");
        }else{
            System.out.println("El numero "+num3+" no es capicua");
        }

    }
}