import java.util.Scanner;
public class Login {
public String loginUsuario;
public String senhaUsuario;
public boolean test;
    public void loginSucedido(){
        System.out.println("Logado com sucesso!");
    }
    public void obterLogin(){
        Scanner ler = new Scanner(System.in);
        test = "Rafa".equalsIgnoreCase(loginUsuario) && "1122".equalsIgnoreCase(senhaUsuario);
        if (test == true){
            loginSucedido();
        }
        else{
            do{
                System.out.println("Usuário ou senha incorretos. Tente novamente.\n");
                System.out.print("Digite seu usuário: ");
                loginUsuario = ler.next();
                System.out.print("Digite sua senha: ");
                senhaUsuario = ler.next();
                test = "Rafa".equalsIgnoreCase(loginUsuario) && "1122".equalsIgnoreCase(senhaUsuario);
            }while(test == false);
            loginSucedido();
        }
    }
    public static void main(String[] args){
        Login L = new Login();
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu usuário: ");
        L.loginUsuario = ler.next();
        System.out.print("Digite sua senha: ");
        L.senhaUsuario = ler.next();
        L.obterLogin();
    }
}