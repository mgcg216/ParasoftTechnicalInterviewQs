
arrs = [10, -2, 5, 6, -5]
big = None
for i in range(0, len(arrs)): #I can use max() but im assuming you want me to code a loop
    n = sum(arrs[i:i + 2])
    if big is None or n > big:
        big = n
print(big)