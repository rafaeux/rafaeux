import java.util.Scanner;
public class Media {
    public float prova1;
    public float prova2;
    public String aluno;
    public void setNotas(){
        Media M = new Media();
        Scanner digitar = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        aluno = digitar.nextLine();
        System.out.print("Digite a primeira nota: ");
        prova1 = digitar.nextFloat();
        System.out.print("Digite a segunda nota: ");
        prova2 = digitar.nextFloat();
        while(prova1<0 || prova1>10){
            System.out.println("Digitação de notas inválida.");
            M.setNotas();
            }
        while(prova2<0 || prova2>10){
            System.out.println("Digitação de notas inválida.");
            M.setNotas();
            }
    }
    public void mediaNotas(float p1, float p2) {
        Media M = new Media();
        this.aluno = aluno;
        this.prova1 = p1;
        this.prova2 = p2;
        float media = (prova1+prova2)/2;
        System.out.println("A média foi " + String.format("%.1f", media));
        if(media>=7) {
            System.out.println("Parabéns "+aluno+", você está aprovado(a).");
            }
        else {
            System.out.println("Poxa "+aluno+", você está reprovado(a).");
            }
    }

    public static void main(String args[]) {
        Media M = new Media();
        M.setNotas();
        M.mediaNotas(M.prova1, M.prova2);
    }
}
