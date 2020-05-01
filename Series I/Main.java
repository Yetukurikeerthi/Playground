#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a;
    double t,x,b=0.5;
 std::cin>>a;
  for(int i=0;i<a;i++)
  {
    if(i==0)
       {
      std::cout<<b;
      continue;
    }
     else
     {
    t=pow(3,i-1);
  x=t+b;
   b=x;
    std::cout<<" "<<x;
}
}
}
