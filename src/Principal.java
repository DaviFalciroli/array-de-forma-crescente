public class Principal {
    
    public static void main(String[] args) {

        int[] lista = { 98, 56, 34, 64, 128, 320, 6, 2, 1, 4, 18, 1024, 32 };

        int aux;

        for(int i = 0; i < lista.length; i++) {  
            for (int j = 0; j < lista.length - 1 ; j++) {  
                if(lista[j] > lista[j+1]) {
                    aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                }
            }
        }

        for (int num : lista) {
            System.out.print(num + " ");
        }
    }
}

