import java.util.Scanner;

public class Data_app {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        
        Data data1 = new Data();
        System.out.println("Insira o dia: ");
        data1.dia = leia.nextInt();
        System.out.println("Insira o mês: ");
        data1.mes = leia.nextInt();
        System.out.println("Insira o ano: ");
        data1.ano = leia.nextInt();

        data1.cadastraDados();
        data1.imprimeData();

        Data data2 = new Data();
        System.out.println("Insira o dia: ");
        data2.dia = leia.nextInt();
        System.out.println("Insira o mês: ");
        data2.mes = leia.nextInt();
        System.out.println("Insira o ano: ");
        data2.ano = leia.nextInt();

        data2.cadastraDados();
        data2.imprimeData();

        leia.close();
    }
} 