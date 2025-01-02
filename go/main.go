package main

import "fmt"

func main() {
	primes := []Numbers{
		NewNumbers(2),
		NewNumbers(3),
		NewNumbers(5),
		NewNumbers(7),
	}

	var elements []Numbers
	for i := 2; i <= 100; i++ {
		elements = append(elements, NewNumbers(i))
    }

	for e := range elements {
		for p := range primes {
			if elements[e].Value != primes[p].Value && elements[e].Value % primes[p].Value == 0 {
				elements[e].Prime = false
                break
            }
		}
	}

	for _, item := range elements {
        fmt.Printf("Value: %d, Prime: %s\n", item.Value, item.Prime)
    }
}

type Numbers struct {
    Value int
	Prime bool
}

func NewNumbers(number int) Numbers {
    return Numbers{
        Value:	number,
        Prime:	true,
    }
}