#include<iostream>
using namespace std;
int main()
{
  int n,a,s,sum=0;
  std::cin>>n>>a;
  s=n+a;
 for(int i=1;i<s;i++)
  {
   if(s%i==0)
   {
     sum=sum+i;
   }
 }
  if(s==sum)
  std::cout<<"They can read the message";
  else
  std::cout<<"They can't read the message";
}