import java.util.Scanner;
public class Estoque {
    public int qatual;
    public int qmin;
    public int qmax;
    Scanner digitar = new Scanner(System.in);
    public void inserirQuantia() {
        System.out.print("Digite a quantidade atual em estoque: ");
        qatual = digitar.nextInt();
        System.out.print("Agora digite a quantidade mínima em estoque: ");
        qmin = digitar.nextInt();
        System.out.print("E por fim, digite a quantidade máxima em estoque: ");
        qmax = digitar.nextInt();
    }
    public void mediaEstoque() {
        inserirQuantia();
        float media = (qmin+qmax)/2;
        if(qatual>=media) {
            System.out.println("Quantidade média: "+media);
            System.out.println("Efetuar compra.");
            }
        else {
            System.out.println("Quantidade média: "+media);
            System.out.println("Não efetuar compra.");
            }
    }
    public static void main(String args[]) {
        Estoque E = new Estoque();
        E.mediaEstoque();
    }
}