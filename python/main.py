class Number:
    def __init__(self, value, prime=True):
        self.value = value
        self.prime = prime

    def __repr__(self):
        return f"Number({self.value}, {self.prime})"

two = Number(2, )
three = Number(3)
five = Number(5)
seven = Number(7)

basic_prime = [two, three, five, seven]

limit = 100
elements = [Number(l) for l in range(2, limit+1)]

for number in elements:
    for bp in basic_prime:
        if number.value != bp.value and (number.value % bp.value == 0):
            number.prime = False
            break

print(elements)
#