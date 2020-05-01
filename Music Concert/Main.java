#include<iostream> 
using namespace std; 
void CountingEvenOdd(int arr[], int arr_size) 
{ 
    int even_count = 0;              
    int odd_count = 0;              
    for(int i = 0 ; i < arr_size ; i++)  
    { 
        if (arr[i] & 1 == 1) 
            odd_count ++ ;          
        else                     
            even_count ++ ;          
    } 
    cout  <<  odd_count
         <<'\n'<< even_count ;          
} 
int main() 
{ 
    int arr[100] ,n;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
    CountingEvenOdd(arr, n); 
}  