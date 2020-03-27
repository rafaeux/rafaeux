import java.util.Scanner;
public class Menu {
    public static void main(String[] args){
        Scanner digita = new Scanner(System.in);
        int temp_DE;
        int temp_PARA;
        float temp_CONV;
        float temp_DIGIT;
        System.out.println("------------------------------");
        System.out.println("* Conversor de Temperaturas *");
        System.out.println("------------------------------\n");
        System.out.println("Qual é o tipo de temperatura inicial?\n[1] - Celsius\n[2] - Fahreinheit\n[3] - Kelvin");
        System.out.print("Digite aqui: ");
        temp_DE = digita.nextInt();
        while(temp_DE<1 || temp_DE>3){
            System.out.print("Digite uma opção válida: ");
            temp_DE = digita.nextInt();
        }
        switch(temp_DE){
                case 1:
                    System.out.println("Para qual tipo de temperatura você deseja converter?\n[1] - Celsius\n[2] - Fahreinheit\n[3] - Kelvin");
                    System.out.print("Digite aqui: ");
                    temp_PARA = digita.nextInt();
                    while(temp_PARA<1 || temp_PARA>3){
                        System.out.print("Digite uma opção válida: ");
                        temp_PARA = digita.nextInt();
                    }
                    if(temp_PARA == 1){
                        System.out.println("Não é possível fazer a conversão de Celsius para Celsius.");
                    }else if(temp_PARA == 2){
                        System.out.print("Digite a temperatura: ");
                        temp_DIGIT = digita.nextFloat();
                        temp_CONV = ((temp_DIGIT*9)/5)+32;
                        System.out.println(String.format("CONVERSÃO: %.1f", temp_CONV)+"°F");
                    }else{
                        System.out.print("Digite a temperatura: ");
                        temp_DIGIT = digita.nextFloat();
                        temp_CONV = temp_DIGIT+273.15f;
                        System.out.println(String.format("CONVERSÃO: %.1f", temp_CONV)+"K");
                    }
                break;
                case 2:
                    System.out.println("Para qual tipo de temperatura você deseja converter?\n[1] - Celsius\n[2] - Fahreinheit\n[3] - Kelvin");
                    System.out.print("Digite aqui: ");
                    temp_PARA = digita.nextInt();
                    while(temp_PARA<1 || temp_PARA>3){
                        System.out.print("Digite uma opção válida: ");
                        temp_PARA = digita.nextInt();
                    }
                    if(temp_PARA == 2){
                        System.out.println("Não é possível fazer a conversão de Fahreinheit para Fahreinheit.");
                    }else if(temp_PARA == 1){
                        System.out.print("Digite a temperatura: ");
                        temp_DIGIT = digita.nextFloat();
                        temp_CONV = (temp_DIGIT-32)*5/9;
                        System.out.println(String.format("CONVERSÃO: %.1f", temp_CONV)+"°C");
                    }else{
                        System.out.print("Digite a temperatura: ");
                        temp_DIGIT = digita.nextFloat();
                        temp_CONV = ((temp_DIGIT-32)*5/9)+273.15f;
                        System.out.println(String.format("CONVERSÃO: %.1f", temp_CONV)+"°K");
                    }
                break;
                case 3:
                    System.out.println("Para qual tipo de temperatura você deseja converter?\n[1] - Celsius\n[2] - Fahreinheit\n[3] - Kelvin");
                    System.out.print("Digite aqui: ");
                    temp_PARA = digita.nextInt();
                    while(temp_PARA<1 || temp_PARA>3){
                        System.out.print("Digite uma opção válida: ");
                        temp_PARA = digita.nextInt();
                    }
                    if(temp_PARA == 3){
                        System.out.println("Não é possível fazer a conversão de Kelvin para Kelvin.");
                    }else if(temp_PARA == 2){
                        System.out.print("Digite a temperatura: ");
                        temp_DIGIT = digita.nextFloat();
                        temp_CONV = ((temp_DIGIT-273.15f)*9/5)+32;
                        System.out.println(String.format("CONVERSÃO: %.1f", temp_CONV)+"°F");
                    }else{
                        System.out.print("Digite a temperatura: ");
                        temp_DIGIT = digita.nextFloat();
                        temp_CONV = temp_DIGIT-273.15f;
                        System.out.println(String.format("CONVERSÃO: %.1f", temp_CONV)+"°C");
                    }
                break;
        }
    }
}