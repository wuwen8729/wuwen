
def compute(add):
    add(1, 2)

def add(x, y):
    print(x + y)

def devo(x,y):
    print(x-y)
def compute2(devo):
    devo(3,1)

# compute(lambda x, y: print(x + y))
compute2(lambda x, y: print(x - y))