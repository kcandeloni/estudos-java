import java.util.ArrayList;
import java.util.List;

public class ListExercicios1 {

    public void oQueEhEsseNumero(int n){

        if(n % 2 == 0){
            if(n >= 0){
                System.err.println(n + " é par e positivo.");
                return;
            }
            System.err.println(n + " é par e negativo.");
        }else{
            if(n >= 0){
                System.err.println(n + " é impar e positivo.");
                return;
            }
            System.err.println(n + " é impar e negativo.");
        }
    }
    public void fibonacci(int n) {
        int antepenultimo = 0;
        int ant = 1;
        int aux;
        if(n >= 1){
            System.err.print("0 ");
        }
        if( n >= 2){
            System.err.print("1 ");
        }
        for(int i = 2; i < n; i++){
            aux = antepenultimo+ant;
            System.err.print(aux+" ");
            antepenultimo = ant;
            ant = aux;
        }
    }
    public void multiplicaAi(int n){
        System.err.println("Tabela de multiplicação por "+n);
        for(int i = 1; i <=10; i++){
            System.err.println(n + " x " + i + " = " + n*i);
        }
    }
    public void piramideDeNumeros(int n){
        int cont = 1;
        while (cont <= n) {
            for(int i = 1; i < cont; i++){
                System.err.print(cont);
            }
            System.err.println(cont);
            cont++;
        }
    }
    public void duplicadosNao(){
        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        List<String> array2 = new ArrayList<>();
        array2.add("Manga");
        array2.add("Caqui");
        array2.add("Morango");
        array2.add("Amora");
        for(int i = 0; i < array1.length; i++) {
            if(array2.contains(array1[i])){
                System.err.println(array1[i]);
            }
        }
    }
    public void holidayzer(String date){
        Holidays holidays = new Holidays();
        holidays.setHoliday(new Holiday("01-01-2024", "Confraternização Mundial"));
        holidays.setHoliday(new Holiday("12-02-2024", "Carnaval"));
        holidays.setHoliday(new Holiday("13-02-2024", "Carnaval"));
        holidays.setHoliday(new Holiday("29-03-2024", "Sexta-feira Santa"));
        holidays.setHoliday(new Holiday("21-04-2024", "Tiradentes"));
        holidays.setHoliday(new Holiday("01-05-2024", "Dia do Trabalho"));

        System.err.println(holidays.getHoliday(date));
        holidays.printHolidays();
    }

}
