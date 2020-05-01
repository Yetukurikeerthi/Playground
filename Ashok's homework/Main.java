#include<iostream>
int main()
{
    int a,b,A[100][100],B[100][100],C[100][100];
  std::cin>>a>>b;
    for(int i=0;i<a;i++)
      for(int j=0;j<b;j++)
        std::cin>>A[i][j];
  for(int i=0;i<a;i++)
      for(int j=0;j<b;j++)
        std::cin>>B[i][j];  
for(int i=0;i<a;i++)
      for(int j=0;j<b;j++)
        C[i][j]=A[i][j]+B[i][j];  
  for(int i=0;i<a;i++)
  {
      for(int j=0;j<b;j++)
    std::cout<<C[i][j]<<" ";
  std::cout<<"\n";
  }
  return  0;
}
    
        
      