import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("inserisci tuo nome");
        String nome= scanner .nextLine();
        
        System.out.println("ciao "+ nome);
        scanner .close();
    }
}
