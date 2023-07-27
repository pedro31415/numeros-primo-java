public class App {
    public static void main(String[] args) throws Exception {
        int[] primeNumbers = new int[1000];
        int countCousin = 0;
        int value = 2;
        while(countCousin < primeNumbers.length){
            boolean prime = true;
            for(int i=2; i<value; i++){
                if(value%i == 0){
                    prime = false;
                    break; 
                }
            }
            if(prime){
                countCousin++;
                primeNumbers[countCousin-1] = value;
                System.out.println("Número primo encontrado: " + value);
            }
            value++;
        }
    }
}
