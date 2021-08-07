# Q. To Check The number is prime or not.
# "The number which devisible by 1 and itself only is called prime number."

def isPrime(num):
	for i in range(2,(int(num/2)+1)):
		if num%i==0:
			return False
	return True

num = int(input("Please enter the Number: "))
if isPrime(num):
    print("Number is prime...")
else:
	print("Number is not prime...")
    
# Time Complexity is: O(n/2)