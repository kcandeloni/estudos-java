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
    
}
