#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  if(a>0&&a<6)
  {
    if(a==1)
      printf("One");
    if(a==2)
      printf("Two");
    if(a==3)
      printf("Three");
    if(a==4)
      printf("Four");
    if(a==5)
      printf("Five");
  }
  else
  {
      printf("Invalid");
  }
    
 // print("")
  return 0;
}