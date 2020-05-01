#include<iostream>
int main()
{
  int n,x=6;
  std::cin>>n;
  std::cout<<x<<" ";
  for(int i=1;i<n;i++)
  {
    x=x+5*i;
    std::cout<<x<<" ";
  }
}
  