#include <iostream>
int swap(int *a, int *b)
{
  int temp;
   temp= *a;
    *a=*b;
    *b=temp;
}
int main()
{
    int x , y ;
  std::cin>>x>>y;
  std::cout<<"Before swapping a= "<<x<<" and b="<<y<<"\n";
    swap(&x, &y);
    std::cout<<"After swapping a= "<<x<<" and b="<<y<<"\n";
    return 0;
}