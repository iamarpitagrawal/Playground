#include <stdio.h>
int main()
{
    int n, reversedNumber = 0, remainder,a,b;
   
    scanf("%d", &n);
    while(n != 0)
    {
        remainder = n%10;
        reversedNumber = reversedNumber*10 + remainder;
        n /= 10;
    }
  a=reversedNumber/10;
  b=a%10;
  printf("%d",b);
    return 0;
}