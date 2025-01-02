fun main() {

    val limit = 100
    val primes = listOfNotNull(Numbers(2), Numbers(3), Numbers(5), Numbers(7))
    val elements: List<Numbers> = (2..limit).map {Numbers(it)}.toList()

    for (e in elements) {
        for(p in primes) {
            if(e.number != p.number && e.number % p.number == 0){
                e.prime = false
                break
            }
        }
    }

    elements.forEach(System.out::print)
}

data class Numbers(
    var number: Int,
    var prime: Boolean = true
)