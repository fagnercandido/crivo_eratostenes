import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var limit = 1000000;
        var primes = List.of(
                new Numbers(2),
                new Numbers(3),
                new Numbers(5),
                new Numbers(7)
                );
        List<Numbers> numbers = IntStream.range(2, limit+1)
                                       .mapToObj(Numbers::new)
                                       .toList();
        for (Numbers n : numbers){
            for(Numbers prime : primes) {
                if(n.number != prime.number && n.number % prime.number == 0){
                    n.prime = false;
                    break;
                }
            }
        }

        System.out.println(numbers);


    }
}

class Numbers {
    public int number;
    public boolean prime = true;

    public Numbers(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number: "+number+" - "+prime;
    }

}