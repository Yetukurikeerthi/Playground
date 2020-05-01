#include<iostream>
int main() 
{
  int i,n,r,count=0;
  std::cin>>n;
  do
  {
    r=n%10;
    count++;
    n=n/10;
  }while(n>0);
    
  std::cout<<count;
  return 0;
}