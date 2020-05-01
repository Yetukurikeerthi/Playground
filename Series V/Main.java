#include<iostream>
int main()
{
  int n,r=11,x,i;
  std::cin>>n;
  x=r*r;
  std::cout<<x<<" ";
  for(i=1;i<n;i++)
  {
    r=r+4;
    x=r*r;
    std::cout<<x<<" ";
  }
}