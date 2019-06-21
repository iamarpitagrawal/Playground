// C++ implementation of Naive method to print all 
// divisors 
#include <stdio.h> 
  
// function to print the divisors 
void printDivisors(int n) 
{ 
    for (int i=1;i<=n;i++) 
        if (n%i==0) 
            printf("%d\n",i); 
} 
  
/* Driver program to test above function */
int main() 
{  int inp;
 scanf("%d",&inp);
     
    printDivisors(inp); 
    return 0; 
} 
