#include<iostream>
using namespace std;
int main()
{
  int n,count=0;
  float result=0.0;
 while(true)
 {
   std::cin>>n;
   if(n<0)
   {
     result--;
     break;
   }
   if(n%2==0)
   {
     result =result-0.5;
   }
   if(n%2!=0)
   {
     result ++;
     count++;
   }
   if(count==3)
     break;
 }
  std::cout<<result;
}
   