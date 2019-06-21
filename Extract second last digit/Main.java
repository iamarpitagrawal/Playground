#include<stdio.h>
int main()
{
 int a,b,c,temp;
  scanf("%d",&a);
  b=a%10;
  temp=a/10;
  c=temp%10;
  printf("%d",c);
  return 0;
}