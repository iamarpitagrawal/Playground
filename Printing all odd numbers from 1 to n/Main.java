#include <stdio.h>

int main()
{
	//loop counter declaration
	int number;
	//variable to store limit /N
	int n;

	//assign initial value 
	//from where we want to print the numbers
	number=1;

	//input value of N
	
	scanf("%d",&n);

	//print statement
	

	//while loop, that will print numbers 
	while(number<=n)
	{
		//Here is the condition to check ODD number
		if(number%2 != 0)
			printf("%d\n",number);
		
		// increasing loop counter by 1
		number++;
	}

	return 0;
}