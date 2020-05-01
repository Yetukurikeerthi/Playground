#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  std::cin>>r>>c>>n;
  if(n>c&&n%2!=0)
    std::cout<<"Yes";
  else if(n<c)
    std::cout<<"Yes";
  else if(c<n)
    std::cout<<"No";
}