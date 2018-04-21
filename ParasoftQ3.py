n=5 #nth prime number
a=1
b=0
while b!=n:
    a=a+1
    k = 0
    for i in range(2,a//2+1): #loops through to see if it has any divisors not including 1 and itself
        if(a%i==0):
            k=k+1
    if(k<=0): #if it has 0 divisors
        b=b+1

print(a)