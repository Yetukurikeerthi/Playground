#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  float x1,y1,x2,y2,x3,y3,X,Y;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  X=(x1+x2+x3)/3;
  Y=(y1+y2+y3)/3;
  std::cout<<X <<"\n";
  std::cout<<Y;
}