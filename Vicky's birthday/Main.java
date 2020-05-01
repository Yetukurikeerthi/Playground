#include<iostream>
int main()
{
int Y;
std::cin>>Y;
  {
if(Y%4==0)
  {
if(Y%100==0)
{
if(Y%400==0)
{
std::cout<<"Vicky can celebrate his birthday.";
}
else
 std::cout<<"Vicky can't celebrate.";
}
  else
    std::cout<<"Vicky can celebrate his birthday.";
  }
else
  std::cout<<"Vicky can't celebrate.";
  }
}
