// Q. To Check The number is prime or not.
// "The number which devisible by 1 and itself only is called prime number."

#include<iostream>
bool isPrime(int num)
{
	for(int i=2; i<=(num/2); i++)
	{
		if(num%i==0)
			return false;
	}
	return true;
}
int main()
{
	std::cout<<"Please enter the Number: ";
	int num{};
	std::cin>>num;

	if(isPrime(num))
		std::cout<<"Number is prime...";
	else
		std::cout<<"Number is not prime...";
	return 0;
}
// Time Complexity is: O(n/2)