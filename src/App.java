import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String cadeia;

        char continua = 'S';
        while(continua == 'S') {
        System.out.println("Digite a cadeia desejada: ");
        cadeia = sc.nextLine();

        LinekdList lista = new LinekdList();

        for(int i = 0; i < cadeia.length(); i++) {
            lista.adicionar(cadeia.charAt(i));
            
        }

        System.out.println(lista.escritor());
        System.out.println();

        int tam = lista.nElementos();
        for(int i =0; i < tam -1; i++) {
            lista.buscador();
        }

        System.out.println(lista.escritor());
        
        continua = sc.next().charAt(0);
        sc.nextLine();
        lista = null;
    }

    sc.close();
    }
}
